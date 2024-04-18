package com.automation.Day5_30th_Mar_2024_Webpage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Topic2_Introduction_To_Tutorialsninja {
	// https://tutorialsninja.com/demo
	
	public static void main(String[] args) {
		/*
		 * Task - I will open the website using Chrome Browser
		 * Select Login Option
		 * Enter email and pw. click login
		 * Click on logoutbutton
		 * Click on continue button
		 * It will come back to home page
		 */
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://tutorialsninja.com/demo");
		
		
	}
	
	public static void loginTutorialsNinja() {
		
	}

}
