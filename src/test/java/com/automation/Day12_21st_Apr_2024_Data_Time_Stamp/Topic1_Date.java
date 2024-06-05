package com.automation.Day12_21st_Apr_2024_Data_Time_Stamp;

import org.testng.annotations.Test;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Topic1_Date {
	
	public String date;
	public WebDriver driver;
	
	@Test (priority=1)
	public String understandingDateTimeStamp() {
		Date date = new Date();
		System.out.println(date);
		// Tue Apr 23 12:05:25 EDT 2024
		// What if i replace this spaces with an underscore:
		
		// String timeStamp = date.toString().replace(" ", "_");
		// System.out.println(timeStamp);
		// now i want the column separate from : to be replaced again with the underscore
		// timeStamp = date.toString().replace(":", "_");
		
		// when there are multiple string operations
		// we should try to keep them in one line
		String timeStamp = date.toString().replace(" ", "_").replace(":", "_");
		System.out.println(timeStamp);
		
		// so we can use the date in the email
		
		return "seleniumpanda" + timeStamp + "@gmail.com";
		
	}
	
	@Test
	public void register() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://tutorialsninja.com/demo");
		driver.findElement(By.linkText("My Account")).click();
		driver.findElement(By.linkText("Register")).click();
		driver.findElement(By.cssSelector("input#input-firstname")).sendKeys("Selenium");
		driver.findElement(By.cssSelector("input[id = input-lastname")).sendKeys("Panda");
		driver.findElement(By.cssSelector("input[id = input-email]")).sendKeys(understandingDateTimeStamp());
		driver.findElement(By.cssSelector("input[id = input-password]")).sendKeys("Selenium@123");
		driver.findElement(By.cssSelector("input[id = input-confirm]")).sendKeys("Selenium@123");
		driver.findElement(By.cssSelector("input#input-telephone")).sendKeys("5714703323");
		driver.findElement(By.cssSelector("input[name = agree]")).click();
		driver.findElement(By.cssSelector("input.btn.btn-primary")).click();
	}
	
	
	

}
