package com.automation.Day13_27th_Apr_2024_Parameterization_in_TestNG;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.AssertJUnit;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Topic1_Introduction {
	
	// parameterization
	// bu using testng.xml
	
	// parameters - some operation with these parameters
	
	// Login logic (we just change the input prameters):
	// seleniumpanda@gmail.com Selenium@123
	// seleniumpanda1@gmail.com Selenium@123
	// ...
	
	public WebDriver driver;
	
	@BeforeMethod
	public void initialSession() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://tutorialsninja.com/demo");	
	}
	@Parameters({"url", "email", "password"})
	
	@Test
	public void loginParameterizationConcept() {
		
		driver.findElement(By.linkText("My Account")).click();
		driver.findElement(By.linkText("Login")).click();
		
		driver.findElement(By.id("input-email")).sendKeys("seleniumpanda@gmail.com");
		driver.findElement(By.id("input-password")).sendKeys("Selenium@123");
		driver.findElement(By.cssSelector("input.btn.btn-primary")).click();
		
		AssertJUnit.assertTrue(driver.findElement(By.linkText("Edit your account information")).isDisplayed());
		AssertJUnit.assertTrue(driver.findElement(By.linkText("Logout")).isDisplayed());
		
	}

}
