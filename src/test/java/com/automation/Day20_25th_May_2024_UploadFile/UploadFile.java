package com.automation.Day20_25th_May_2024_UploadFile;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class UploadFile {
	
	public WebDriver driver;
	
	@Test
	public void uploadFile() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://tutorialsninja.com/demo/index.php?route=product/product&product_id=42");
		driver.findElement(By.id("button-upload222")).sendKeys("/Users/danilodeiana/eclipse-workspace/My_Pnt_Mar_June_2024_Weekend_Batch/test-output/Screenshots/shaadilogo.png");
		
	}

}
