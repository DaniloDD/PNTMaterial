package com.automation.Day7_6th_Apr_2024_Basics_Of_TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Topic10_Example_To_ShowcaseUpto_Topic9 {
	
	public WebDriver driver;
	
	@BeforeMethod
	public void setupBrowserURL() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://tutorialsninja.com/demo");
	}
	
	@Test(priority=1, invocationCount = 3)
	public void registerAccount() {
		driver.findElement(By.linkText("My Account")).click();
		driver.findElement(By.linkText("Register")).click();
		driver.findElement(By.id("input-firstname")).sendKeys("Selenium");
		driver.findElement(By.id("input-lastname")).sendKeys("Panda");
		driver.findElement(By.id("input-telephone")).sendKeys("5713422");
		driver.findElement(By.id("input-password")).sendKeys("Selenium");
		driver.findElement(By.id("input-confirm")).sendKeys("Selenium");
		driver.findElement(By.name("agree")).click();
		driver.findElement(By.cssSelector("input.btn.btn-primary")).click();   //xpath
	}
	
	
	@Test(priority=2, dependsOnMethods="registerAccount")
	public void loginWithValidCredentials() {
		driver.findElement(By.linkText("My Account")).click();
		driver.findElement(By.linkText("Login")).click();
		driver.findElement(By.id("input-email")).sendKeys("danilo.deiana0@gmail.com");
		driver.findElement(By.id("input-password")).sendKeys("Selenium@123");
		driver.findElement(By.cssSelector("input.btn.btn-primary")).click();
		System.out.println("This is what i expect to run 1");
	}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

}
