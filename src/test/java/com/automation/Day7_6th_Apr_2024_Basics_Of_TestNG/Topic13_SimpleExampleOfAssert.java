package com.automation.Day7_6th_Apr_2024_Basics_Of_TestNG;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Topic13_SimpleExampleOfAssert {

	// WebPage level
	// getTitle(), getCurrentUrl(), getPageSource()

	// WebElement level
	// isDisplayed, isEnabled, isSelected

	public WebDriver driver;

	@BeforeMethod
	public void setup() {

		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://tutorialsninja.com/demo");

	}

	@Test(priority = 1)
	public void goingToLoginPage() {
		// Assert and chose getTitle and getCurrentUrl

		driver.findElement(By.linkText("My Account")).click();
		driver.findElement(By.linkText("Login")).click();

		String expectedTitle = "Account Login";
		String actualTitle = driver.getTitle();

		AssertJUnit.assertTrue(actualTitle.contains(expectedTitle));

		// assert and choose getTitle and getCurrentUrl
		// you can get the currenturl using this:
		// System.out.println(driver.getCurrentUrl());

		String expectedCurrentUrl = "https://tutorialsninja.com/demo/index.php?route=account/login";
		String actualCurrentUrl = driver.getCurrentUrl();

		AssertJUnit.assertEquals(actualCurrentUrl, expectedCurrentUrl);

	}

	@Test(priority = 2)
	public void loginWithValidCredentials() {
		// Assert to determine the presence of email textbox and password textbox and
		// loginbutton
		// isEnabled and isDisplayed
		driver.findElement(By.linkText("My Account")).click();
		driver.findElement(By.linkText("Login")).click();

		WebElement emailTextbox = driver.findElement(By.id("input-email"));
		WebElement passwordTextBox = driver.findElement(By.id("input-password"));
		WebElement loginButton = driver.findElement(By.cssSelector("input.btn.btn-primary"));
		AssertJUnit.assertTrue(emailTextbox.isEnabled() && emailTextbox.isDisplayed());
		AssertJUnit.assertTrue(passwordTextBox.isEnabled() && passwordTextBox.isDisplayed());
		AssertJUnit.assertTrue(loginButton.isEnabled() && loginButton.isDisplayed());

	}

	@AfterMethod
	public void TearDown() {
		driver.quit();
	}

}
