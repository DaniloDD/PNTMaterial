package com.automation.Day11_20th_Apr_2024_SoftAssert_in_TestNG;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.asserts.SoftAssert;

public class Topic2_SoftAssert_Automation {

	public WebDriver driver;
	
	@Test
	public void openApplicationAndLogin() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://tutorialsninja.com/demo");
		driver.findElement(By.linkText("My Account")).click();
		driver.findElement(By.linkText("Login")).click();
		driver.findElement(By.id("input-email")).sendKeys("seleniumpanda@gmail.com");
		driver.findElement(By.id("input-password")).sendKeys("Selenium@123");
		driver.findElement(By.cssSelector("input.btn.btn-primary")).click();
		AssertJUnit.assertFalse(driver.findElement(By.linkText("Logout")).isDisplayed());
		driver.findElement(By.linkText("Logout")).click();
	}
	
	@Test
	public void openApplicationAndLoginUsingSoftAssert() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://tutorialsninja.com/demo");
		driver.findElement(By.linkText("My Account")).click();
		driver.findElement(By.linkText("Login")).click();
		driver.findElement(By.id("input-email")).sendKeys("seleniumpanda@gmail.com");
		driver.findElement(By.id("input-password")).sendKeys("Selenium@123");
		driver.findElement(By.cssSelector("input.btn.btn-primary")).click();
		SoftAssert softassert = new SoftAssert();
		AssertJUnit.assertFalse(driver.findElement(By.linkText("Logout")).isDisplayed());
		driver.findElement(By.linkText("Logout")).click();
		softassert.assertAll();
	}
}
