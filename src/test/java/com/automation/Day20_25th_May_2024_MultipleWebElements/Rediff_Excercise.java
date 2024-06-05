package com.automation.Day20_25th_May_2024_MultipleWebElements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Rediff_Excercise {

	// collect all the footer links in a list

	// click on each link in the footerlink and get their respective title or
	// currenturl

	public WebDriver driver;

	@Test
	public void fliplart() throws Exception {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rediff.com");

		List<WebElement> footer = driver.findElements(By.xpath("/html/body/div[7]"));
		
		System.out.println("Total links are : " + footer.size());
		
		for (int i=0; i< footer.size(); i++) {
			System.out.println(footer.get(i).getText() + "-------" + footer.get(i).getAttribute("href"));
			// investors - click on this footerlink and get me the title of this page
			footer.get(i).click();
			System.out.println("The title of investors is : " + driver.getTitle());
			
			driver.navigate().back();
			Thread.sleep(2000);
			// StaleElementException
			footer = driver.findElements(By.xpath("/html/body/div[7]"));
		}
		
		

	}

}
