package com.automation.Day8_7th_April_2024_Xpaths;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Topic2_Advanced_Xpaths {

		// A. Syntax 1: html[@attribute = 'valueoftheattribute']
		// B. Syntax 2: html[@attribute1 = 'valueoftheattribute' and @attribute2 = 'valueoftheattribute']
		// C. Syntax 3: html[@attribute1 = 'valueoftheattribute' or @attribute2 = 'valueoftheattribute']
		// D. Syntax 4: html[text() = 'textofthelink'] --> used only for links
		// E. Syntax 5: html[contains(text(), 'textofthelink')]
		// F. Syntax 6: html[contains(@attribute, 'valueoftheattribute')]
		// G. Syntax 7: html[starts-with(@attribute, 'valueOfTheAttributeStartingPointWhichIsFixed')]
		// F. Syntax 8: html[ends-with(@attribute, 'valueOfTheAttributeStartingPointWhichIsFixed')]
		

		public WebDriver driver;

		
		@Test
		public void loginTutorialsNinja() {

			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://tutorialsninja.com/demo");
			driver.findElement(By.xpath("//ul[@class = 'list-inline']/child::li[2]/a")).click();
			// driver.findElement(By.linkText("My Account")).click();
			driver.findElement(By.xpath("//ul[@class = 'list-inline']/child::li[2]/ul/child::li[2]/child::a[1]")).click();
			//driver.findElement(By.linkText("Login")).click();
			driver.findElement(By.xpath("//input[@id= 'input-email']")).sendKeys("seleniumpanda@gmail.com");
			driver.findElement(By.xpath("//input[@id= 'input-password']")).sendKeys("Selenium@123");
			// login button
			driver.findElement(By.xpath("//input[@class = 'btn btn-primary']")).click();
		}
}
