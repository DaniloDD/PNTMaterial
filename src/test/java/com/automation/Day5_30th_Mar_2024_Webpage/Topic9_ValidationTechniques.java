package com.automation.Day5_30th_Mar_2024_Webpage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Topic9_ValidationTechniques {

	// done with two different 
	
	public static void main(String[] args) {
		// what is title of a webpage?
		
		

	}
	
	public static void validationAtPageLevel() {
		/*
		 * getTitle();
		 * getCurrentUrl();
		 * getPageSource();
		 */
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://rediff.com");
		
		System.out.println("The title of rediff home page is :" + driver.getTitle());
		
		String expectedTitle = "Rediff.com: News | Rediffmail | Stock Quotes | Sshopping";
		String actualTitle = driver.getTitle();
		
		
		String expectedCurrentUrl = "https://rediff.com";
		String actualTitleUrl = driver.getTitle();
		
		if (actualTitle.equals(expectedTitle) && actualTitleUrl.equals(expectedCurrentUrl)) {
			driver.findElement(By.className("signin")).click();
		}
		else {
			System.out.println("Title Mistmach");
			
		}
		
		
	}
	
	public static void validationAtWebElementLevel() {
	
		/*
		 * isDisplayed();
		 * isEnabled();
		 * isSelected();
		 */
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://rediff.com");
		
		WebElement signInLink = driver.findElement(By.linkText("Sign in"));
		if (signInLink.isDisplayed() && signInLink.isEnabled()) {
			signInLink.click();
		}
		else {
			System.out.println("The sign in link is not enabled");
		}
		
		
	WebElement usernameTextBox = driver.findElement(By.id("login1"));
	
	if (usernameTextBox.isDisplayed() && usernameTextBox.isEnabled()) {
		usernameTextBox.sendKeys("danilo.deiana@gmail.com");
	}
		
	}

}
