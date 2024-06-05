package com.automation.Day19_18th_May_2024_Mouse_Keyboard_Actions;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class KeyboardActions {
	
	public WebDriver driver;
	
	@Test
	public void loginTNKeyboard() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://tutorialsninja.com/demo");
		
		WebElement myAccountDropDownlink = driver.findElement(By.linkText("My Account"));
		
		
		Actions actions = new Actions(driver);
		actions.moveToElement(myAccountDropDownlink).click().build().perform();
		actions.moveToElement(driver.findElement(By.linkText("Login"))).click().build().perform();
		
		
		WebElement emailTextBox = driver.findElement(By.id("input-email"));
		WebElement passwordTextBox = driver.findElement(By.id("input-password"));
		WebElement loginButton = driver.findElement(By.cssSelector("input.btn.btn-primary"));
		
		actions.click(emailTextBox).sendKeys("seleniumpanda@gmail.com").build().perform();
		
		// let s do some keyboard actions:
		
		//I want to copy the complete email which I have written in the emailTextBox
		
		//Ctrl + A [this will select all]
		actions.keyDown(emailTextBox, Keys.COMMAND).sendKeys("a").keyUp(Keys.COMMAND).build().perform();
		
		//Ctrl + C[copying]
		actions.keyDown(emailTextBox, Keys.COMMAND).sendKeys("c").keyUp(Keys.COMMAND).build().perform();
		
		//press the TAB key so that cursor will come to password TextBox
		actions.keyDown(emailTextBox, Keys.TAB).build().perform();
		
		//Ctrl + V [pasting]
		actions.keyDown(passwordTextBox, Keys.COMMAND).sendKeys("v").keyUp(Keys.COMMAND).build().perform();
		
		//hit Enter button for loginbutton
		actions.keyDown(loginButton, Keys.ENTER).build().perform();
		
	}

}

