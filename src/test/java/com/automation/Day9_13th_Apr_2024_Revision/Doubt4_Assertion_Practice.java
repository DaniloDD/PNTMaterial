package com.automation.Day9_13th_Apr_2024_Revision;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Doubt4_Assertion_Practice {
	
	public WebDriver driver;
	
	@Test
	public void registerMandatoryDetails() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://tutorialsninja/demo.com/demo");
		driver.findElement(By.linkText("My Account"));
		driver.findElement(By.linkText("Register"));
		driver.findElement(By.cssSelector("input.btn.btn-primary")).click();
		
		String actualPrivacyPolicyWarningMessage = driver.findElement(By.xpath("//div[contains(@class, 'alert-dismissible')]")).getText();
		String expectedPrivacyPolicyWarningMessage = "Warning: You must agree to the Privacy Policy";
		AssertJUnit.assertTrue(actualPrivacyPolicyWarningMessage.contains(expectedPrivacyPolicyWarningMessage));
		
		
		//create 5 more cases for warning messages
		
		
	}

}
