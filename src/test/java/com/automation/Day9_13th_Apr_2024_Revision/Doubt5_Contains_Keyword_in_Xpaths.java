package com.automation.Day9_13th_Apr_2024_Revision;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Doubt5_Contains_Keyword_in_Xpaths {

	
	public WebDriver driver;
	
	@Test
	public void loginTN() {
		
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://tutorialsninja.com/demo");
		driver.findElement(By.linkText("My Account")).click();
		driver.findElement(By.linkText("Login")).click();
		driver.findElement(By.xpath("//input[contains(@id, 'input-email')]")).sendKeys("seleniumpanda@gmail.com");
		driver.findElement(By.xpath("//input[contains(@id, 'input-password')]")).sendKeys("Selenium@123");
		driver.findElement(By.xpath("//input[contains(@class, 'btn btn-primary')]")).click();
		
	}
}
