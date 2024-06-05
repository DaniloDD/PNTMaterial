package com.automation.Day19_18th_May_2024_Extra_Topics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Topic2_Handling_Frames {
	
	// what is a frame? It is an html element
	
	// html page is embedded within another html page
	
	// you might have to locate a WebElement which is present inside the [inner emebedded html]
	
	// Example: Polo T-Shit inside a shirt. And your phone is in the chest pocket of that polo T-Shirt
	
	// sourcedemo - which one is the outside source and which is the outer?
	// there is not inner source -- no frame
	
	// in rediff we can find many frames
	
	
	// iframes are mostly identified by 
	// 1. index
	// 2. name or id
	// 3. WebElement
	
	
	
	public WebDriver driver;
	
	@Test
	public void openBrowser() {
		
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.globalsqa.com/demo-site/frames-and-windows/#iFrame");      // original webpage
		
		driver.switchTo().frame("globalSqa");			// name of the frame		
		driver.findElement(By.id("mobile_menu_toggler")).click();
	}

}
