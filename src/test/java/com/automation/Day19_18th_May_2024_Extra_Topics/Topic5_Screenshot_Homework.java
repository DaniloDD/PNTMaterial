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

public class Topic5_Screenshot_Homework {

	public WebDriver driver;

	@Test
	public void screenshotHomework() throws IOException {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.shaadi.com/");

		WebElement logo = driver.findElement(By.xpath("//*[@id=\"homepage\"]/div"));

		File source = logo.getScreenshotAs(OutputType.FILE);

		File destination = new File(System.getProperty("user.dir") + "/test-output/Screenshots/shaadilogo.png");
		FileHandler.copy(source, destination);

	}

}
