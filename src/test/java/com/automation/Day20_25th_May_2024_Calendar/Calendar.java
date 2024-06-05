package com.automation.Day20_25th_May_2024_Calendar;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class Calendar {
	
	// https://seleniumpractise.blogspot.com/2016/08/how-to-handle-calendar-in-selenium.html
	
	public WebDriver driver;
	
	/*
	@Test
	public void datePickerTest() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://seleniumpractise.blogspot.com/2016/08/how-to-handle-calendar-in-selenium.html");
		driver.findElement(By.id("datepicker")).sendKeys("05/01/2024");
		
		// slopw down a bit to make surre
	}
	*/
	
	
	@Test
	public void datePickerTest2() throws Exception {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://seleniumpractise.blogspot.com/2016/08/how-to-handle-calendar-in-selenium.html");
		driver.findElement(By.id("datepicker")).click();
		
		// slopw down a bit to make surre the calendar will pop up
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("ui-datepicker-div")));
		
		String monthYear = driver.findElement(By.className("ui-datepicker-title")).getText();
		// System.out.println(monthYear);
		
		// which month and year we are targeting? December 2024
		// how do we reach there
		
		String month = monthYear.split(" ")[0];
		String year = monthYear.split(" ")[1];
		
		while (!(month.equals("December") && year.equals("2024"))) {
			driver.findElement(By.xpath("//a[@title = 'Next']")).click();
			monthYear = driver.findElement(By.className("ui-datepicker-title")).getText();
			
			month = monthYear.split(" ")[0];
			year = monthYear.split(" ")[1];
		}
		Thread.sleep(2000);
		driver.findElement(By.xpath("//td[@data-hadler = 'selectDay']/a[text() = '25']")).click();
		
	}
	
	
	/*
	Practice in the following website
	
	@Test
	public void datePickerTestWithFieldNotEdible() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://makemytrip.com");
	}
	*/

}
