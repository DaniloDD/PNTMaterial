package com.automation.Day7_6th_Apr_2024_Basics_Of_TestNG;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


// check line 49 and106

//Assertions or Validations are essentials
	// TestNG gives us 2 pre-definied classes which help us in Assertions
	
	// 1. Assert 
	// 2. SoftAssert
	
	// write assertions in Test cases, not beforemethod or aftermethod

	// 1. Assert is a class which has a lot of methods which help us to do assertions
	// a) assertEquals
	// b) assertTrue
	// c) assertNotEquals
	// d) assertFalse
	// e) softAssert

public class Topic11_Assertions_In_TestNG {
	
	
	public WebDriver driver; // variable declared at a class level so that all the methods can directly
	// access it

	@BeforeMethod
	public void setup() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://tutorialsninja.com/demo");

	}

	@Test(priority = 1)
	public void loginWithValidCredentials() {
		driver.findElement(By.linkText("My Account")).click();
		driver.findElement(By.linkText("Login")).click();
		driver.findElement(By.id("input-email")).sendKeys("danilo.deiana0@gmail.com");
		driver.findElement(By.id("input-password")).sendKeys("Selenium@123");
		driver.findElement(By.cssSelector("input.btn.btn-primary")).click();
		System.out.println("This is what i expect to run 1");
		
		AssertJUnit.assertTrue(driver.findElement(By.linkText("Edit your account information")).isDisplayed());
	}

	@Test(priority = 2)
	public void loginWithValidEmailInvalidPassword() {
		driver.findElement(By.linkText("My Account")).click();
		driver.findElement(By.linkText("Login")).click();
		driver.findElement(By.id("input-email")).sendKeys("danilo.deiana0@gmail.com");
		driver.findElement(By.id("input-password")).sendKeys("saassa");
		driver.findElement(By.cssSelector("input.btn.btn-primary")).click();
		System.out.println("This is what i expect to run 2");
	}

	@Test(priority = 3)
	public void loginWithInvalidEmailValidPassword() {
		driver.findElement(By.linkText("My Account")).click();
		driver.findElement(By.linkText("Login")).click();
		driver.findElement(By.id("input-email")).sendKeys("danilo.deiana0@gmail.com");
		driver.findElement(By.id("input-password")).sendKeys("Selenium@123");
		driver.findElement(By.cssSelector("input.btn.btn-primary")).click();
		System.out.println("This is what i expect to run 3");
	}

	@Test(priority = 4, enabled = false)
	public void loginWithInvalidCredentials() {
		driver.findElement(By.linkText("My Account")).click();
		driver.findElement(By.linkText("Login")).click();
		driver.findElement(By.id("input-email")).sendKeys("danilo.deiana0@gmail.com");
		driver.findElement(By.id("input-password")).sendKeys("Selenium@123");
		driver.findElement(By.cssSelector("input.btn.btn-primary")).click();
		System.out.println("This is what i expect to run 4");
	}

	@Test(priority = 5)
	public void loginWithBlankCredentials() {
		driver.findElement(By.linkText("My Account")).click();
		driver.findElement(By.linkText("Login")).click();
		driver.findElement(By.id("input-email")).sendKeys("");
		driver.findElement(By.id("input-password")).sendKeys("");
		driver.findElement(By.cssSelector("input.btn.btn-primary")).click();
		System.out.println("This is what i expect to run 5");
	}
	
	@Test(priority=6)
	public void loginWithSameInvalidCredentialsAfterMultipleFailures() {
		driver.findElement(By.linkText("My Account")).click();
		driver.findElement(By.linkText("Login")).click();
		driver.findElement(By.id("input-email")).sendKeys("danilo.deiana0@gmail.com");
		driver.findElement(By.id("input-password")).sendKeys("Selenium@123");
		driver.findElement(By.cssSelector("input.btn.btn-primary")).click();
		
		String expectedWarningMessage = "Warning: Your account has exceeded allowed number of login attempts. Please try again in 1 hour";
		String actualWarningMessage = driver.findElement(By.xpath("//div[contains(@class, 'alert-dismissible')]")).getText();
		
		// either
		AssertJUnit.assertEquals(actualWarningMessage, expectedWarningMessage);
		// or
		AssertJUnit.assertTrue(actualWarningMessage.contains(expectedWarningMessage));
		
	}

	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

}
