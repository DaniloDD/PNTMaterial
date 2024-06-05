package com.automation.Day8_7th_April_2024_Xpaths;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
// import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class Topic1_Introduction {

	// What is xpath?
	// Xpath is address of a webelement

	// Types:

	// 1. Absolute Xpath
	// Ex: search box, select element and inspect -->
	// the full thing in pink should be selected --> right click --> copy --> full
	// xpath --> /html/body/header/div/div/div[2]/div/input
	// it is not common to use this method because the programmer can change
	// something and the path will change
	// Absolute xpath is more accurate but highly risky to use

	// 2. Dynamic/Relative Xpath

	// Syntax of Xpaths:

	// A. Syntax 1:
	// html[@attribute = 'valueoftheattribute']
	// Ex:
	// input[@name = 'search']
	// input[@class = 'form-control input-lg']
	// input[@id = 'login1']
	// input[@name = 'login']

	// B. Syntax 2:
	// html[@attribute1 = 'valueoftheattribute' and @attribute2 =
	// 'valueoftheattribute']
	// Ex: input[@id = 'login1' and @name = 'login']

	// C. Syntax 3:
	// html[@attribute1 = 'valueoftheattribute' or @attribute2 =
	// 'valueoftheattribute']
	// Ex: input[@id = 'login1' or @name = 'login']

	// D. Syntax 4:
	// html[text() = 'textofthelink'] --> used only for links
	// Ex: a[text() = 'Create Account']

	// E. Syntax 5:
	// html[contains(text(), 'textofthelink')] --> used for links as an alternative
	// to the previous one
	// Ex: a[contains(text(), 'Create Account')]

	// F. Syntax 6: --> used for any web element
	// html[contains(@attribute, 'valueoftheattribute')]
	// Ex: input[contains(@name, 'proceed')]
	// input[contains(@id, 'login1')]

	// G. Syntax 7:
	// html[starts-with(@attribute, 'valueOfTheAttributeStartingPointWhichIsFixed')]
	// Ex:
	// id = login1
	// id = login2
	// id = login3
	// input[starts-with(@id, 'login')]

	// F. Syntax 8:
	// html[ends-with(@attribute, 'valueOfTheAttributeStartingPointWhichIsFixed')]
	// Ex:
	// id = 1234_banner_android
	// id = 1235_banner_android
	// id = 1236_banner_android
	// input[ends-with(@id, '_banner_android')]

	public WebDriver driver;

	/*
	@Test
	public void loginTutorialsNinja() {

		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://tutorialsninja.com/demo");
		driver.findElement(By.linkText("My Account")).click();
		driver.findElement(By.linkText("Login")).click();
		driver.findElement(By.xpath("//input[@id= 'input-email']")).sendKeys("seleniumpanda@gmail.com");
		driver.findElement(By.xpath("//input[@id= 'input-password']")).sendKeys("Selenium@123");
		// login button
		driver.findElement(By.xpath("//input[@class = 'btn btn-primary']")).click();
	}
	*/
	
	@Test
	public void registerTutorialsNinja() {
		
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://tutorialsninja.com/demo");
		driver.findElement(By.linkText("My Account")).click();
		driver.findElement(By.linkText("Register")).click();
		driver.findElement(By.xpath("//input[@id=\"input-firstname\"]")).sendKeys("Kumar");
		driver.findElement(By.xpath("//input[@id=\"input-lastname\"]")).sendKeys("Panda");
		driver.findElement(By.xpath("//input[@id=\"input-email\"]")).sendKeys("seleniumpanda@gmail.com");
		driver.findElement(By.xpath("//input[@id=\"input-telephone\"]")).sendKeys("57185534342");
		driver.findElement(By.xpath("//input[@id=\"input-password\"]")).sendKeys("Selenium@123");
		driver.findElement(By.xpath("//input[@id=\"input-confirm\"]")).sendKeys("Selenium@123");
		driver.findElement(By.xpath("//input[@name=\"agree\"]")).click();
		driver.findElement(By.xpath("//input[@class = 'btn btn-primary']")).click();
	}
	
	/*
	@AfterMethod
	public void quitSession() {
		driver.quit();
	}
	*/

}
