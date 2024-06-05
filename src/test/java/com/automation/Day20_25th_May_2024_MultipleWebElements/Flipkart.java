package com.automation.Day20_25th_May_2024_MultipleWebElements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Flipkart {

	// total number of links in a website

		public WebDriver driver;

		@Test
		public void fliplart() {
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://flipkart.com/mens");
			
			// name
			// description 
			// price
			// discount
			
			List <WebElement> name = driver.findElements(By.className("syl9yP"));
			List <WebElement> discount = driver.findElements(By.className("UkUFwK"));
			List <WebElement> price = driver.findElements(By.className("Nx9bqj"));
			
			for (int i = 0; i < name.size(); i++) {
				System.out.println(name.get(i).getText() + "--------" + discount.get(i).getText() + "------" + price.get(i).getText());
			}
			
		}
}
