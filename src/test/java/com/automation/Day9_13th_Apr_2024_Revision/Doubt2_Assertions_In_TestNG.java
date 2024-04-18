package com.automation.Day9_13th_Apr_2024_Revision;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Doubt2_Assertions_In_TestNG {

	public WebDriver driver;

	@Test
	public void login() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://tutorialsninja.com/demo/index.php?route=account/login"); // what is the proof that this url is correct
	
		//Assert.assertFalse(driver.findElement(By.xpath("//h2[contains(text(), 'Returning Customer')]")).isDisplayed());
		 
		// it will not work because we gave a wrong assertions, if i make it assertiontrue it will work
		// driver.findElement(By.id("input-email")).sendKeys("seleniumpanda99@gmail.com");
		// System.out.println("ciao");
	
		Assert.assertTrue(driver.findElement(By.xpath("//h2[contains(text(), 'Returning Customer')]")).isDisplayed());
		driver.findElement(By.id("input-email")).sendKeys("seleniumpanda@gmail.com");
		driver.findElement(By.id("input-password")).sendKeys("Selenium@12345");
		driver.findElement(By.cssSelector("input.btn.btn-primary")).click();
		
		String expectedWarningMessage = "Warning: No match for E-Mail Address and/or Password.";
		String actualWarningMessage = driver.findElement(By.xpath("//div[contains(@class, 'alert-dismissible')]")).getText();
		
		Assert.assertEquals(actualWarningMessage, expectedWarningMessage);
	}
	
}
