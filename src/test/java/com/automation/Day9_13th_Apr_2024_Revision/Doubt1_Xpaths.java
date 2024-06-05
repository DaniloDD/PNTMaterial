package com.automation.Day9_13th_Apr_2024_Revision;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

//SIMPLE CASES
// if there is a unique id -  no problem
// if there is a unique (somewhat trustworthy) class value 
// if there is a unique name

// MEDIUM CASES
// dynamic id
// too much compounded value calss
// input[@class = 'ng-tns-c57-8 .....very long one....']
// dynamic name

// COMPLEX CASES
// there is no class or it is not unique
// there is no name or it is not unique
// there is no id or it is not unique
// very good xpath knowledge

public class Doubt1_Xpaths {

	public WebDriver driver;

	@Test
	public void openWeatherMapLogoImage() {

		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://openweathermap.org");
		driver.findElement(By.linkText("Sign in")).click();
		driver.findElement(By.xpath("//li[@class = 'logo']/descendant::img[1]")).click();
		
	}
}
