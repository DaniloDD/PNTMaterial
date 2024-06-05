package com.automation.Day7_6th_Apr_2024_Basics_Of_TestNG;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Topic5_Prioritizing_TestCases {

	public WebDriver driver; // variable declared at a class level so that all the methods can directly
								// access it

	@BeforeMethod
	public void setup() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://tutorialsninja.com/demo");

	}

	@Test(priority=1)
	public void loginWithValidCredentials() {
		driver.findElement(By.linkText("My Account")).click();
		driver.findElement(By.linkText("Login")).click();
		driver.findElement(By.id("input-email")).sendKeys("danilo.deiana0@gmail.com");
		driver.findElement(By.id("input-password")).sendKeys("Selenium@123");
		driver.findElement(By.cssSelector("input.btn.btn-primary")).click();
		System.out.println("This is what i expect to run 1");
	}
	
	@Test(priority=2)
	public void loginWithValidEmailInvalidPassword() {
		driver.findElement(By.linkText("My Account")).click();
		driver.findElement(By.linkText("Login")).click();
		driver.findElement(By.id("input-email")).sendKeys("danilo.deiana0@gmail.com");
		driver.findElement(By.id("input-password")).sendKeys("saassa");
		driver.findElement(By.cssSelector("input.btn.btn-primary")).click();
		System.out.println("This is what i expect to run 2");
	}
	
	@Test(priority=3)
	public void loginWithInvalidEmailValidPassword() {
		driver.findElement(By.linkText("My Account")).click();
		driver.findElement(By.linkText("Login")).click();
		driver.findElement(By.id("input-email")).sendKeys("danilo.deiana0@gmail.com");
		driver.findElement(By.id("input-password")).sendKeys("Selenium@123");
		driver.findElement(By.cssSelector("input.btn.btn-primary")).click();
		System.out.println("This is what i expect to run 3");
	}
	
	@Test(priority=4)
	public void loginWithInvalidCredentials() {
		driver.findElement(By.linkText("My Account")).click();
		driver.findElement(By.linkText("Login")).click();
		driver.findElement(By.id("input-email")).sendKeys("danilo.deiana0@gmail.com");
		driver.findElement(By.id("input-password")).sendKeys("Selenium@123");
		driver.findElement(By.cssSelector("input.btn.btn-primary")).click();
		System.out.println("This is what i expect to run 4");
	}
	
	@Test(priority=5)
	public void loginWithBlankCredentials() {
		driver.findElement(By.linkText("My Account")).click();
		driver.findElement(By.linkText("Login")).click();
		driver.findElement(By.id("input-email")).sendKeys("");
		driver.findElement(By.id("input-password")).sendKeys("");
		driver.findElement(By.cssSelector("input.btn.btn-primary")).click();
		System.out.println("This is what i expect to run 5");
	}


	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

}
