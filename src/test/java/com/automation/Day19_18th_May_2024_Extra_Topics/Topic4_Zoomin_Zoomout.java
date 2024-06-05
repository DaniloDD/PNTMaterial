package com.automation.Day19_18th_May_2024_Extra_Topics;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Topic4_Zoomin_Zoomout {

	public WebDriver driver;

	@Test
	public void zoominZoomout() throws InterruptedException {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rediff.com");
		driver.findElement(By.xpath("/html/body/div[8]/div[2]/div[1]/div[2]/div[2]/button[2]/p")).click();
		driver.findElement(By.xpath("/html/body/div[8]/div[2]/div[2]/div[3]/div[2]/button[2]/p")).click();

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("document.body.style.zoom = '300%' ;");

		Thread.sleep(2000);
		js.executeScript("document.body.style.zoom = '50%' ;");

		Thread.sleep(2000);
		js.executeScript("document.body.style.zoom = '100%' ;");

	}

}
