package com.automation.Day12_21st_Apr_2024_ChromeOptions;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import java.util.Arrays;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class Topic1_ChromeOptions {

	// you can make your coding execution faster, slower, keep the same speed
	// you can directly maximize the window
	// you can use other Arguments

	public String date;
	public WebDriver driver;
	public ChromeOptions options;

	@Test(priority = 1)
	public String understandingDateTimeStamp() {
		Date date = new Date();
		String timeStamp = date.toString().replace(" ", "_").replace(":", "_");
		return "seleniumpanda" + timeStamp + "@gmail.com";

	}

	@Test(invocationCount = 1)
	public void register() {
		// Step1: Create the object of ChromeOptions class
		options = new ChromeOptions();

		// Step2: I want to increase the speed of my execution
		// options.setPageLoadStrategy(PageLoadStrategy.EAGER);
		options.setPageLoadStrategy(PageLoadStrategy.NORMAL);
		// options.setPageLoadStrategy(PageLoadStrategy.NONE);

		options.addArguments("--start-maximized");
		options.addArguments("--incognito");
		options.setExperimentalOption("excludeSwitches", Arrays.asList("enable-automation", "disable-infobars"));

		driver = new ChromeDriver(options);
		// driver.manage().window().maximize();
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

	@Test (priority=2)
	public void headlessMode() {

		options = new ChromeOptions();
		options.setPageLoadStrategy(PageLoadStrategy.NORMAL);
		options.addArguments("--headless"); // --> run in the background without opening the browser

		driver = new ChromeDriver(options);
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


	@AfterMethod
	public void tearDown() {
		// driver.quit();
	}

}
