package com.java.Day16_5th_May_2024_Date_Scanner_Wrapper;

import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Topic1_Date_Class {
	
	public static WebDriver driver;
	

	public static void main(String[] args) {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://tutorialsninja.com/demo");
		driver.findElement(By.linkText("My Account")).click();
		driver.findElement(By.linkText("Register")).click();
		
		/*
		 * and so on with the code... use dateStamp to register the email
		 */
	}
	
	public static String dateStamp() {
		Date date = new Date();
		System.out.println(date);
		
		String dateTimeStamp = date.toString().replace(" ", "_").replace(":", "_");
		System.out.println(dateTimeStamp);
		
		return "seleniumpanda" + dateTimeStamp + "@gmail.com";
	}

}
