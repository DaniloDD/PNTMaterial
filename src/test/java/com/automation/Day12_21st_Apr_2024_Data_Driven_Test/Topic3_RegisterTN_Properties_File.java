package com.automation.Day12_21st_Apr_2024_Data_Driven_Test;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import java.io.FileInputStream;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Topic3_RegisterTN_Properties_File {

	public WebDriver driver;
	public Properties prop;
	public FileInputStream ip;
	public SoftAssert softassert;
	
	public Topic3_RegisterTN_Properties_File() throws Exception{
		prop = new Properties();
		ip = new FileInputStream(System.getProperty("user.dir") + "/src/test/java/com/automation/Day12_21st_Apr_2024_Data_Driven_Test/config_Register.properties");
		prop.load(ip);
	}
	
	@Test
	public void registerTN() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(prop.getProperty("url"));
		driver.findElement(By.linkText("My Account")).click();
		driver.findElement(By.linkText("Register")).click();
		driver.findElement(By.id("input-email")).sendKeys(prop.getProperty("email"));
		driver.findElement(By.id("input-firstname")).sendKeys(prop.getProperty("firstName"));
		driver.findElement(By.id("input-lastname")).sendKeys(prop.getProperty("lastName"));
		driver.findElement(By.id("input-telephone")).sendKeys(prop.getProperty("telephone"));
		driver.findElement(By.id("input-password")).sendKeys(prop.getProperty("password"));
		driver.findElement(By.id("input-confirm")).sendKeys(prop.getProperty("confirmPassword"));
		driver.findElement(By.name("agree")).click();
		driver.findElement(By.cssSelector("input.btn.btn-primary")).click();
		AssertJUnit.assertTrue(driver.findElement(By.linkText("Logout")).isDisplayed());
		softassert.assertAll();
		
		
	}
}
