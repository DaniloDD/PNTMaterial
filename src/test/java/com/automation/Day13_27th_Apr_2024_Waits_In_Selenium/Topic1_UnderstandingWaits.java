package com.automation.Day13_27th_Apr_2024_Waits_In_Selenium;

import org.testng.annotations.Test;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class Topic1_UnderstandingWaits {

	// There are 3 types of waits
	// 1) Implicit Wait
	// 2) Explicit Wait
	// 3) Fluent Wait

	public WebDriver driver;

	// implicit
	@Test
	public void implicitWaitUnderstanding() {
		// Smart wait
		// Let's say one WebElement is misbehaving a lot
		// 7 seconds - the maximum time it took
		// Give implicit wait time for 10 seconds
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
		driver.manage().timeouts().scriptTimeout(Duration.ofSeconds(100));
	}

	// explicit
	// Case 1: 
	// it is not used that much, only in certain situations
	@Test
	public void explicitWaitUnderstanding() throws InterruptedException {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://tutorialsjava.com/demo");
		Thread.sleep(2000); // explicit wait, 2 seconds Selenium will wait
		driver.findElement(By.linkText("My Account")).click();
		driver.findElement(By.linkText("Login")).click();
		driver.findElement(By.id("input-email")).sendKeys("seleniumpanda@gmail.com");
		driver.findElement(By.id("input-password")).sendKeys("Selenium@123");
		driver.findElement(By.cssSelector("input.btn.btn-primary")).click();
	}

	// Case 2:
	// WebDriverWait is the class used instead of Thread.sleep(2000)
	// first we have to create the object of WebDriverWait
	// second - using the reference of WebDriverWait you will call certain methods
	// which has certain pre-defined parameters
	@Test
	public void usingWebDriverWait() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://tutorialsjava.com/demo");
		
		WebElement MyAccountLink = driver.findElement(By.linkText("My Account"));
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(MyAccountLink));
		wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.linkText("Login")))).click();
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.id("input-email")))).sendKeys("seleniumpanda@gmail.com");
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.id("input-password")))).sendKeys("Panda@123");
		wait.until(null);
		// direct command
		// wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.linkText("My Account"))));
	}

}
