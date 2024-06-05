package com.automation.Day14_28th_Apr_2024_Data_Provider;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Topic2_DataProvider_With_LoginExample {

	// you have 25 usernames and password out of which 1 combination is wrong.
	// Determine that wrong combo
	public WebDriver driver;
	public WebDriverWait wait;

	@Test (dataProvider = "loginDataTutorialsNinja")
	public void loginTest(String email, String password) {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://tutorialsninja.com/demo");
		driver.findElement(By.linkText("My Account")).click();
		driver.findElement(By.linkText("Login")).click();
		driver.findElement(By.id("input-email")).sendKeys(email);
		driver.findElement(By.id("input-password")).sendKeys(password);
		driver.findElement(By.cssSelector("input.btn.btn-primary")).click();
		
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.linkText("Logout"))));
		AssertJUnit.assertTrue(driver.findElement(By.linkText("Logout")).isDisplayed());		
	}

	@DataProvider
	public Object[][] loginDataTutorialsNinja() {
		Object[][] loginData = { 
				{ "seleniumpanda1@gmail.com", "Selenium@123" },
				{ "seleniumpanda2@gmail.com", "Selenium@123" }, 
				{ "seleniumpanda3@gmail.com", "Selenium@123" },
				{ "seleniumpanda4@gmail.com", "Selenium@123" }, 
				{ "seleniumpanda5@gmail.com", "Selenium@123" }, 
				{ "seleniumpanda6@gmail.com", "Selenium@123" }, 
				{ "seleniumpanda7@gmail.com", "Selenium@123" }, 
				{ "seleniumpanda8@gmail.com", "Selenium@123" }, 
				{ "seleniumpanda9@gmail.com", "Selenium@123" }, 
				{ "seleniumpanda10@gmail.com", "Selenium@123" }
		};
		return loginData;
	}
}
