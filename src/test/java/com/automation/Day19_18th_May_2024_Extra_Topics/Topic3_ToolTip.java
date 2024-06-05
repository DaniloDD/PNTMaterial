package com.automation.Day19_18th_May_2024_Extra_Topics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Topic3_ToolTip {
	
	// when you go with your mouse on top of an element it is the title that appears near the mouse
	
	public WebDriver driver;
	
	@Test
	public void extractingToolTip() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https:rediff.com");
		
		WebElement moneyLink = driver.findElement(By.linkText("Money"));
		String tooltip = moneyLink.getAttribute("title");
		System.out.println("the tooltip of money link is : " + tooltip);
	}

}
