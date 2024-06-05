package com.automation.Day19_18th_May_2024_Extra_Topics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Topic1_DeleteCookies {

	// cookies are pieces of data that are stored in our devices while using websites
	// they are used to remember the information about the user and speed up processes
	// some cookies they stay in the user profile until they are manually deleted
	//
	
	public WebDriver driver;
	
	@Test
	public void openBrowser() {
		driver = new ChromeDriver();
		driver.manage().deleteAllCookies();			
	}
	
	
}
