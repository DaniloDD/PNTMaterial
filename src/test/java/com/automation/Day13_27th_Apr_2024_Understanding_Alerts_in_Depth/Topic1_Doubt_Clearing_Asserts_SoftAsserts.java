package com.automation.Day13_27th_Apr_2024_Understanding_Alerts_in_Depth;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Topic1_Doubt_Clearing_Asserts_SoftAsserts {

	// Code without Assertions
	
	// Code with Assert
	
	// Code with SoftAssert
	
	// Software Development and Software Testing
	
	// Test means validation / assertion / checkpoints
	
	// when we receive for example a warning message, that one has to be asserted
	
	// our job is expected outcome(defined in the requirement documents) with the actual outcome (coming from the test)
	
	public WebDriver driver;
	
	@Test
	public void loginWithValidCredentials() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://tutorialsninja.com/demo");
		driver.findElement(By.linkText("My Account")).click();
		driver.findElement(By.linkText("Login")).click();
		
		driver.findElement(By.id("input-email")).sendKeys("seleniumpanda@gmail.com");
		driver.findElement(By.id("input-password")).sendKeys("Selenium@123");
		driver.findElement(By.cssSelector("input.btn.btn-primary")).click();
		
		AssertJUnit.assertTrue(driver.findElement(By.linkText("Edit your account information")).isDisplayed());
		AssertJUnit.assertTrue(driver.findElement(By.linkText("Logout")).isDisplayed());
		
		
		
	}
}
