package com.automation.Day6_31st_Mar_2024_WebElement_Revision;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Topic1_Revision {

	public static void main(String[] args) {
		signInLinkOfRediff();
	}

	public static void signInLinkOfRediff() {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rediff.com");
		// driver.findElement(By.linkText("Sign in")).click();
		// sometimes we need to do another way of than the privous direct one and we have to use a separate object
		WebElement signInLink = driver.findElement(By.linkText("Sign in"));
		signInLink.click();
		
	}

	public static void tutorialsNinja() {
		// WebDriver is a pre-defined interface and ChromeDriver is a pre-defined class
		// in Selenium
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://tutorialsninja.com/demo");
		// i have to click on My Account (as we checked in the DOM is a link)
		driver.findElement(By.linkText("My Account")).click();

		// another way is by using the predefined interface WebElement
		WebElement myAccountDropdownLink = driver.findElement(By.linkText("My Account"));
		myAccountDropdownLink.click();

		// for an image for example we use img src as a css selector
		WebElement iPhoneImage = driver.findElement(By.cssSelector(
				"<img src=\"https://tutorialsninja.com/demo/image/cache/catalog/demo/banners/iPhone6-1140x380.jpg\" alt=\"iPhone 6\" class=\"img-responsive\">"));
		iPhoneImage.click();

		// what happens whne we click on the iphone6 image
		// it takes us to a page which has Samsung Gal;axy tab and the title of the page
		// is Samsung Galaxy Tab 10.1

	}

	public static void whatIsAWebElement() {
		/*
		 * Website Webpage WebElement - text, images, radiobuttons, button , checkboxs,
		 * etc.
		 */
	}

}
