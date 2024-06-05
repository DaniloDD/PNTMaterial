package com.automation.Day12_21st_Apr_2024_Data_Driven_Test;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import java.io.FileInputStream;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Class_Assignement {

	public WebDriver driver;
	public Properties prop1;
	public Properties prop2;
	public FileInputStream ip1;
	public FileInputStream ip2;
	public SoftAssert softassert;

	public Class_Assignement() throws Exception {

		prop1 = new Properties();
		prop2 = new Properties();
		ip1 = new FileInputStream(System.getProperty("user.dir")
				+ "/src/test/java/com/automation/Day12_21st_Apr_2024_Data_Driven_Test/config_Login.properties");
		ip2 = new FileInputStream(System.getProperty("user.dir")
				+ "/src/test/java/com/automation/Day12_21st_Apr_2024_Data_Driven_Test/config_Register.properties");

		prop1.load(ip1);
		prop2.load(ip2);
	}

	@BeforeMethod
	public void openBrowser() {
		driver = new ChromeDriver();
		softassert = new SoftAssert();
		driver.manage().window().maximize();
		driver.get(prop1.getProperty("url"));
	}

	@Test(priority=2)
	public void loginTN() {
		driver.findElement(By.linkText("My Account")).click();
		driver.findElement(By.linkText("Login")).click();
		driver.findElement(By.id("input-email")).sendKeys(prop1.getProperty("validEmail"));
		driver.findElement(By.id("input-password")).sendKeys(prop1.getProperty("validPassword"));
		driver.findElement(By.cssSelector("input.btn.btn-primary")).click();
		AssertJUnit.assertTrue(driver.findElement(By.linkText("Logout")).isDisplayed());
		softassert.assertAll();
	}

	@Test(priority=1)
	public void registerTN() {

		driver.findElement(By.linkText("My Account")).click();
		driver.findElement(By.linkText("Register")).click();
		driver.findElement(By.id("input-email")).sendKeys(prop2.getProperty("email"));
		driver.findElement(By.id("input-firstname")).sendKeys(prop2.getProperty("firstName"));
		driver.findElement(By.id("input-lastname")).sendKeys(prop2.getProperty("lastName"));
		driver.findElement(By.id("input-telephone")).sendKeys(prop2.getProperty("telephone"));
		driver.findElement(By.id("input-password")).sendKeys(prop2.getProperty("password"));
		driver.findElement(By.id("input-confirm")).sendKeys(prop2.getProperty("confirmPassword"));
		driver.findElement(By.name("agree")).click();
		driver.findElement(By.cssSelector("input.btn.btn-primary")).click();
		// softassert.assertTrue(driver.findElement(By.linkText("Logout")).isDisplayed());
		// softassert.assertAll();
	}

	@AfterMethod
	public void closeSess() {
		// driver.quit();
	}

}
