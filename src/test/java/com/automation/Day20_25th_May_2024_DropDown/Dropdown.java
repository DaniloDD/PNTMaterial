package com.automation.Day20_25th_May_2024_DropDown;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Dropdown {

public WebDriver driver;
	
	@Test
	public void uploadFile() throws Exception {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://makemytrip.com");
		driver.findElement(By.id("fromCity")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@placeholder='From']")).sendKeys("New");
		Thread.sleep(2000);
		
		int i = 0;
		while (i<6) {
			Thread.sleep(1000);
			driver.findElement(By.xpath("//*[@placeholder='From']")).sendKeys(Keys.DOWN);
			i++;
		}
		driver.findElement(By.xpath("//*[@placeholder='From']")).sendKeys(Keys.ENTER);
		
		Thread.sleep(2000);
		driver.findElement(By.id("toCity")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@placeholder='To']")).sendKeys("La");
		Thread.sleep(2000);
		
		int j = 0;
		while (i<4) {
			Thread.sleep(1000);
			driver.findElement(By.xpath("//*[@placeholder='To']")).sendKeys(Keys.DOWN);
			i++;
		}
		driver.findElement(By.xpath("//*[@placeholder='To']")).sendKeys(Keys.ENTER);
	}
}
