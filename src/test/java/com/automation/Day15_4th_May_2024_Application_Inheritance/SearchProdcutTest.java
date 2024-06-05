package com.automation.Day15_4th_May_2024_Application_Inheritance;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SearchProdcutTest {

	public WebDriver driver;
	
	@BeforeMethod
	public void setup() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://tutorialsninja.com/demo");
	}
	
	@Test(priority=1)
	public void validProdcut() {
		driver.findElement(By.name("search")).sendKeys("HP");
		driver.findElement(By.cssSelector("i.fa.fa-search")).click();
	}
}
