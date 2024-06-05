package com.automation.Day15_4th_May_2024_Application_of_Encapsulation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

	public WebDriver driver;
	
	// My Account link
	
	// here i would like to hide my WebElement
	
	@FindBy(linkText = "My Account")
	private WebElement myAccountDropDown;	// i am hiding my web element
	@FindBy(linkText = "Login")
	private WebElement LoginDropdown;
	
	public HomePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	//data get - perform an action
	
	public void clickOnMYAccountDropdown() {
		myAccountDropDown.click();
	}
	
	public void clickOnLoginDropdown() {
		LoginDropdown.click();
	}
}
