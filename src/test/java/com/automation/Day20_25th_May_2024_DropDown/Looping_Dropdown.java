package com.automation.Day20_25th_May_2024_DropDown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Looping_Dropdown {

	public WebDriver driver;

	@Test
	public void uploadFile() throws Exception {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://easemytrip.com");
		
		// PreSelection = 1 traveler
		// PostSelection = n travelers and n cannot be greater than 9
		
		String preSelection = driver.findElement(By.id("spnDrpNo")).getText();
		System.out.println("Totatl traveler before selection is " + preSelection);
		driver.findElement(By.id("iDownArr")).click();
		
		Thread.sleep(2000);
		
		int adults = 1;
		while (adults< 4) {
			driver.findElement(By.xpath("//*[@id=\"add\" and @class=\"add plus_box1\"]")).click();
			adults++;
		}
		
		int children = 1;
		while (children< 3) {
			driver.findElement(By.xpath("//*[@id=\"add\" and @class=\"add plus_boxChd\"]")).click();
			children++;
		}
		
		int infants = 1;
		while (infants< 2) {
			driver.findElement(By.xpath("//*[@id=\"add\" and @class=\"add plus_box1Inf\"]")).click();
			infants++;
		}
		
		Thread.sleep(2000);
		
		driver.findElement(By.id("traveler")).click();
		
		String postSelection = driver.findElement(By.id("spnDrpNo")).getText();
		System.out.println("Total traveler post selection is " + postSelection);
	}
}
