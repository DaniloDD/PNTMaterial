package com.automation.Day14_28th_Apr_2024_Data_Provider;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Topic3_DataProvider_With_RegisterExample {

	public WebDriver driver;
	
	@DataProvider
	public Object[][] registerdataForTutorialsNinja() {
		Object[][] registerData = { {"Selenium", "Panda", "1231231", "Selenium@123", "Selenium@123"},
				{"Selenium", "Panda", "1231231", "Selenium@123", "Selenium@123"},
				{"Selenium", "Panda", "1231231", "Selenium@123", "Selenium@123"},
				{"Selenium", "Panda", "1231231", "Selenium@123", "Selenium@123"},
				{"Selenium", "Panda", "1231231", "Selenium@123", "Selenium@123"}				
		};
		return registerData;
	}
	
	@Test (dataProvider = "registerdataForTutorialsNinja")
	public void registerTN(String firstName, String lastName, String phone, String password, String confirmPassword) {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://tutorialsninja.com/demo");
		driver.findElement(By.linkText("My Account")).click();
		driver.findElement(By.linkText("Register")).click();
		driver.findElement(By.id("input-firstname")).sendKeys(firstName);
		driver.findElement(By.id("input-lastname")).sendKeys(lastName);
		driver.findElement(By.id("input-telephone")).sendKeys(phone);
		driver.findElement(By.id("input-password")).sendKeys(password);
		driver.findElement(By.id("input-confirm")).sendKeys(confirmPassword);
		
	}
}
