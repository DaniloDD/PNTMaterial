package com.automation.Day10_14th_Apr_2024_cssSelector;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Topic1_Syntax_cssSelectors {

	// xpaths - are more popular than css in Automation
	// css is a little faster than xpaths
	// one disadvantage/particularity while using css:
	// 1. u can only come from top to bottom
	// 2. css cannot accomodate compounded class values in simple syntax format
	
	
	// Xpath syntax: 	--> //html[@attribute, 'value']		EX: --> //input[@id = 'input-email']
	// css syntax:		--> html[attribute =value]			EX: --> input[id = input-email]
	
	// special case with cssSelector and it is very useful and very fast
	// if there is a unique id or if there is a compounded value class:
	//					html#idvalue											--> EX: input#input-email
	//					html.compoundvalue1.compoundvalue2.compoundvalue3		--> EX: input.btn.btn-primary
	
	
	
	public WebDriver driver;
	
	@Test
	public void loginUsingCSS() {
		
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://tutorialsninja.com/demo");
		driver.findElement(By.linkText("My Account")).click();
		driver.findElement(By.linkText("Login")).click();
		driver.findElement(By.cssSelector("input[id = input-email]")).sendKeys("seleniumpanda@gmail.com");
		driver.findElement(By.cssSelector("input[id = input-password]")).sendKeys("Selenium@123");
		// driver.findElement(By.cssSelector("input[class = btn btn-primary]")).click(); 	// this is not going to work
		driver.findElement(By.cssSelector("input.btn.btn-primary")).click();
	}
	
	@Test
	public void registerUsingCss() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://tutorialsninja.com/demo");
		driver.findElement(By.linkText("My Account")).click();
		driver.findElement(By.linkText("Register")).click();
		driver.findElement(By.cssSelector("input#input-firstname")).sendKeys("Selenium");
		driver.findElement(By.cssSelector("input[id = input-lastname")).sendKeys("Panda");
		driver.findElement(By.cssSelector("input[id = input-email]")).sendKeys("seleniumpanda52@gmail.com");
		driver.findElement(By.cssSelector("input[id = input-password]")).sendKeys("Selenium@123");
		driver.findElement(By.cssSelector("input[id = input-confirm]")).sendKeys("Selenium@123");
		driver.findElement(By.cssSelector("input#input-telephone")).sendKeys("5714703323");
		driver.findElement(By.cssSelector("input[name = agree]")).click();
		driver.findElement(By.cssSelector("input.btn.btn-primary")).click();
		
		
	}
	
	@Test
	public void traversingUsingCss() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://openweathermap.org");
		// driver.findElement(By.cssSelector("li.logo>a>img")).click();
		driver.findElement(By.cssSelector("li.logo a img")).click();
		// p#signin_info>a:nth-child(3)
	}
	
	
	
}
