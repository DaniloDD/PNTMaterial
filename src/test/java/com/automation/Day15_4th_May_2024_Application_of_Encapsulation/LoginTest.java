package com.automation.Day15_4th_May_2024_Application_of_Encapsulation;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class LoginTest {

	public WebDriver driver;
	
	@Test
	public void validCredentials() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://ninjatutorials.com/demo");
		HomePage homepage = new HomePage(driver);
		homepage.clickOnMYAccountDropdown();
		
		driver.findElement(By.linkText("Login")).click();
		driver.findElement(By.id("input-email")).sendKeys("seleniumpanda@gmail.com");
		driver.findElement(By.id("input-password")).sendKeys("Selenium@123");
		driver.findElement(By.cssSelector("input.btn.btn-primary")).click();
	}
	
}
