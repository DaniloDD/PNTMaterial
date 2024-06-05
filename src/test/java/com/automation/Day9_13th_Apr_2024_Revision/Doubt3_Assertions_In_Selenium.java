package com.automation.Day9_13th_Apr_2024_Revision;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Doubt3_Assertions_In_Selenium {

	// is at webpage level -  title of the page, currenturl of the page, pagesource
	
	// is at WebElement level - displayed or not, enabled or not, selected or not
	
	
	public WebDriver driver;
	
	@Test
	public void login() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://tutorialsninja.com/demo/index.php?route=account/login"); // what is the proof that this url is correct
		
		String expectedTitle = "Account Login";
		String actualTitle = driver.getTitle();
		
		String expectedCurrentUrl = "https://tutorialsninja.com/demo/index.php?route=account/login";
		String actualCurrentURL = driver.getCurrentUrl();
		
		
		
		if(actualTitle.equals(expectedTitle) && actualCurrentURL.equals(expectedCurrentUrl)) {
			System.out.println("The login url is correct and it is safe");
		}
		
		WebElement emailTextBox = driver.findElement(By.id("input-email"));
		if (emailTextBox.isEnabled() && emailTextBox.isDisplayed()) {
			emailTextBox.sendKeys("seleniumpanda@gmail.com");
		}
		
	}
	
}
