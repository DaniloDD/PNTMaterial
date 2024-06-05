package com.automation.Day19_18th_May_2024_Extra_Topics;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.Test;

public class Topic5_Screenshot {
	
	/*
	Step 1: Identify the WebElement which you need to take the screenshot of
	
	Step 2: Technical Step
	
	Step 3: Where do you want to keep the screenshot
	
	Step 4: Copy the source into the destination
	
	 */
	
	public WebDriver driver;
	
	@Test
	public void screenshot() throws IOException {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://openweathermap.org");
		
		//Step 1: identify and select element
		WebElement logo = driver.findElement(By.cssSelector("div.section.where-to"));
		
		// Step 2: using the logo we will use a method known as getScreenshot
		File source = logo.getScreenshotAs(OutputType.FILE);
		
		// Step 3: where to store it
		// we manually store it and we need the path
		// go to our project --> right click --> properties --> go in the folder path --> go inside the project folder 
		// --> create new folder manually known as Screenshots --> copy the path of this folder
		// paste the path and add the name of the screenshot file  "path" + ""
		System.out.println(System.getProperty("user.dir"));
		
		File destination = new File(System.getProperty("user.dir") + "/test-output/Screenshots/openweathermaplogo.png");
		
		
		// Step 4: copy the source into the destination
		FileHandler.copy(source, destination);
		
		
	}

}
