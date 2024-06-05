package com.automation.Day13_27th_Apr_2024_Waits_In_Selenium;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Topic2_Class_Assignement {

	// Create the registration TN code
	// create the code using webdriverwait
	
	public WebDriver driver;
	public WebDriverWait wait;
	
	@BeforeMethod
	public void initialSession() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://tutorialsninja.com/demo");
		wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		
	}
	
	@Test (invocationCount = 2)
	public void registrationTNG() {
		wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.linkText("My Account")))).click();
		wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.linkText("Register")))).click();
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.id("input-firstname")))).sendKeys("Dani");
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.id("input-lastname")))).sendKeys("dei");
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.id("input-email")))).sendKeys("seleniumpanda12121@gamil.com");
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.id("input-password")))).sendKeys("ciao");
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.id("input-confirm")))).sendKeys("ciao");
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.id("input-telephone")))).sendKeys("234234234");
		
		wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.name("agree")))).click();
		wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.cssSelector("input.btn.btn-primary")))).click();
	}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
}
