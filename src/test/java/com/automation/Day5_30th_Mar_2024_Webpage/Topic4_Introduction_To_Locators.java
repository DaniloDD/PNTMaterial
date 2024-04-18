package com.automation.Day5_30th_Mar_2024_Webpage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Topic4_Introduction_To_Locators {

	/*
	 * in Selenium 4 there are 16 locators
	 * in Selenium 3 there were 11 locators
	 
	 Most widely used 8 locators are:
	 1) id
	 2) class
	 3) name
	 4) xpath
	 5) cssSelector
	 6) linkText
	 7) partiallinkText
	 8) tagname 
	 
	*/
	
	public static void main(String[] args) {
		cnnSignIn();
	}
	
	public static void tutorialsNinjaLogin() {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://tutorialsninja.com/demo");
		driver.findElement(By.linkText("My Account")).click();
		driver.findElement(By.linkText("Login")).click();
		driver.findElement(By.id("input-email")).sendKeys("danilo.deiana0@gmail.com");
		driver.findElement(By.id("input-password")).sendKeys("Selenium123@");
		// driver.findElement(By.className("btn btn-primary")).click();   // Compound class names not permitted
		driver.findElement(By.cssSelector("input.btn.btn-primary")).click();
		// driver.findElement(By.linkText("Logout")).click();
		// driver.findElement(By.linkText("Continue")).click();
		
	}
	
	public static void tutorialsNinjaRegister() {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://tutorialsninja.com/demo");
		driver.findElement(By.linkText("My Account")).click();
		driver.findElement(By.linkText("Register")).click();
		driver.findElement(By.id("input-firstname")).sendKeys("Danilo");
		driver.findElement(By.id("input-lastname")).sendKeys("Deiana");
		driver.findElement(By.id("input-email")).sendKeys("danilo.deiana0@gmail.com");
		driver.findElement(By.id("input-telephone")).sendKeys("123");
		driver.findElement(By.id("input-password")).sendKeys("Selenium");
		driver.findElement(By.id("input-confirm")).sendKeys("Selenium");
		// driver.findElement(By.className("btn btn-primary")).click();   // Compound class names not permitted
		driver.findElement(By.name("agree")).click();
		driver.findElement(By.cssSelector("input.btn.btn-primary")).click();
		
		// driver.findElement(By.linkText("Logout")).click();
		// driver.findElement(By.linkText("Continue")).click();
		
	}
	
	public static void cnnSignIn() {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.cnn.com/");
		driver.findElement(By.className("user-account-nav__text-button user-account-nav__text-button--unauth userAccountButton")).click();
		driver.findElement(By.id("login-email-input")).sendKeys("danilo.deiana0@gmail.com");
		driver.findElement(By.id("login-password-input")).sendKeys("Selenium123@");
		// driver.findElement(By.className("btn btn-primary")).click();   // Compound class names not permitted
		driver.findElement(By.cssSelector("input.btn.btn-primary")).click();
		
	}
	
	public static void rediffSignIn() {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.rediff.com/");
		driver.findElement(By.className("signin")).click();
		driver.findElement(By.id("login1")).sendKeys("danilo.deiana0@gmail.com");
		driver.findElement(By.id("password")).sendKeys("Selenium123@");
		driver.findElement(By.name("proceed")).click();
	}
}
