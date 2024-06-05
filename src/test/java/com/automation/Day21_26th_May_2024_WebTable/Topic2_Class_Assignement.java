package com.automation.Day21_26th_May_2024_WebTable;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Topic2_Class_Assignement {
	
	// 1. Print the current price of Kush Industries - 10.51
	// 2. determine the current price of the company present in the 999th row
	// 3. print the 5 rows of the WebTable with all the cols associated 
		// i. top 5 rows of the webtable
		// ii. bottom 5 rows of the webtable
		// iii. 5 rows anywhere in the middle
	// 4. Choose any 5 companies of your choise - get their respective Current Prices(rs) only
		// company name - Current price
		// company name - Current price
		// company name - Current price
		// company name - Current price
	
	public WebDriver driver; 
	
	@Test
	public void webTableExercise() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://money.rediff.com/gainers/bse/daily/groupall");
		
		
		
		WebElement kushIndustries = driver.findElement(By.xpath("//*[@id=\"leftcontainer\"]/table/tbody/tr[95]/td[1]/a"));
		System.out.println(kushIndustries.getText());
		
		// WebElement kushIndustries = driver.findElement(By.xpath("//*[@id=\"leftcontainer\"]/table/tbody/tr[95]/td[1]/a"));
		
		
		String companyname = "Kush Industries";
		// List
		
		
		for (int i =0; i < companyname.length(); i++) {
			
		}
		
	}

}
