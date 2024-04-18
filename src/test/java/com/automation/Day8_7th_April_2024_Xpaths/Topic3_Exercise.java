package com.automation.Day8_7th_April_2024_Xpaths;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Topic3_Exercise {
	
	// go to rediff and for Grievances or any web element link at the bottom of the page write 20 different types of xpaths
	
	public WebDriver driver;
	
	 
	@Test
	public void practiceXpaths() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.rediff.com/");
		// 1.
		driver.findElement(By.xpath("//a[text() = 'Grievances']")).click();
		// 2.
		driver.findElement(By.xpath(""));
	}

}
