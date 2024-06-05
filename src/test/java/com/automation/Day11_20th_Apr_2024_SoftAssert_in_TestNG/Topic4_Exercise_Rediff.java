package com.automation.Day11_20th_Apr_2024_SoftAssert_in_TestNG;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Topic4_Exercise_Rediff {

	public WebDriver driver;
	public Select select;

	@BeforeMethod
	public void openBrowser() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rediff.com");

	}

	@Test
	public void createNewAccount() {
		driver.findElement(By.linkText("Create Account")).click();
		driver.findElement(By.name("namee3be31f1")).sendKeys("Danilo");
		driver.findElement(By.name("logine3be31f1")).sendKeys("DanyDey");
		;
		driver.findElement(By.name("passwde3be31f1")).sendKeys("ciao");
		driver.findElement(By.name("confirm_passwde3be31f1")).sendKeys("ciao");
		driver.findElement(By.name("mobnoe3be31f1")).sendKeys("571382332");
		
		select.selectByVisibleText("Mar");

		select = new Select(driver.findElement(By.id("day")));
		select.selectByVisibleText("15");

		select = new Select(driver.findElement(By.id("year")));
		select.selectByVisibleText("1996");
	}

	@AfterMethod
	public void closeSession() {
		// driver.quit();
	}

}
