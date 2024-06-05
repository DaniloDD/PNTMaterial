package com.java.Day16_5th_May_2024_this_keyword;

import java.sql.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

// this() can be used to invoke current Class constructor

public class Application_Of_Use3 {

	public WebDriver driver;
	
	public static void main(String[] args) {
		Application_Of_Use3 use3 = new Application_Of_Use3("seleniumpanda@gmail.com", "Selenium@123");
	}
	
	public Application_Of_Use3() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://tutorialsninja.com/demo");
		driver.findElement(By.linkText("My Account")).click();
		
	}
	
	public Application_Of_Use3(String email, String password) {
		this();
		driver.findElement(By.linkText("Login")).click();
		driver.findElement(By.id("input-email")).sendKeys(email);
		driver.findElement(By.id("input-password")).sendKeys(password);
		driver.findElement(By.cssSelector("input.btn.btn-primary")).click();
	}
	
	public Application_Of_Use3(String firstname, String lastname, String email, String telephone, String password, String confirm) {
		this();
		driver.findElement(By.linkText("Register")).click();
		driver.findElement(By.id("input-firstname")).sendKeys(firstname);
		driver.findElement(By.id("input-lastname")).sendKeys(lastname);
		driver.findElement(By.id("input-email")).sendKeys(email);
		driver.findElement(By.id("input-telephone")).sendKeys(telephone);
		driver.findElement(By.id("input-password")).sendKeys(password);
		driver.findElement(By.id("input-confirm")).sendKeys(confirm);
		driver.findElement(By.name("agree")).click();
		driver.findElement(By.cssSelector("input.btn.btn-primary")).click();
	}
	
	public String dateTimeStamp() {
		// Date date = new Date();
		// String dateStamp = date.toString().replace(" ", "_").replace(":", "_");
		return "seleniumpanda";
	}
	
	

}
