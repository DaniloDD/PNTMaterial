package com.automation.Day12_21st_Apr_2024_Alerts_PopUps;

import org.testng.annotations.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Topic1_How_To_Handle_Alerts_PopUps {
	
	public WebDriver driver;
	
	@BeforeMethod
	public void openSession() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		driver.findElement(By.className("signinbtn")).click();
		
		// now you want to enter username and password
		// so we have to manage the alert popups like this:
		// so we have to click ok
		// and we can do that by asking our driver to switch from the regular window to the popup one
		
		
		// we use the pre-defined interface Alert (it is not a class)
		Alert alert = driver.switchTo().alert();
		// there are 3 main methods that we use in an Alert
		// 1. alert.accept();
		// 2. alert.dismiss();			--> used when there is a (x) close button
		// 3. alert.getText();			--> used to print the content text of the alert
		
		System.out.println(alert.getText());
		alert.accept();
		
		driver.findElement(By.id("login1")).sendKeys("seleniumpanda@gmail.com");
		driver.findElement(By.id("password")).sendKeys("Selenium@123");		
		
	}
	
	@Test
	public void loginRediffAlert() {
		
	}

}
