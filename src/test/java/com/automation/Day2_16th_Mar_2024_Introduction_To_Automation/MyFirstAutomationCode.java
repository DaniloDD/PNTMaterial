package com.automation.Day2_16th_Mar_2024_Introduction_To_Automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MyFirstAutomationCode {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		// ctrl/Command + Shift + O (letter) to import libraries
		driver.manage().window().maximize();
		driver.get("https://costco.com");
		driver.quit();
		
		WebDriver driver1 = new FirefoxDriver();
		driver1.manage().window().maximize();
		driver1.get("https://amazon.com");
		driver.quit();
		
		WebDriver driver2 = new EdgeDriver();
		driver2.manage().window().maximize();
		driver2.get("https://walmart.com");
		driver2.quit();
		
		

	}

}
