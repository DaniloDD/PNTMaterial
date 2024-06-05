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

public class Topic2_Properties_file {

	// it is very important in terms of automation
	// nameofthefile.properties

	// you save certain data in the properties file in the form of key = value
	// you have to find the path of the properties file wherever it is saved
	public WebDriver driver;
	public Properties prop;
	public FileInputStream ip;
	public SoftAssert softassert;

	public Topic2_Properties_file() throws Exception {
		// 1. Create a constructor
		// 2. create the Object of Properties class

		prop = new Properties();

		// 3. create the object of FileInputStream Class and pass the path of the
		// properties file inside the constructor of this FileInputStream
		ip = new FileInputStream(System.getProperty("user.dir")
				+ "/src/test/java/com/automation/Day12_21st_Apr_2024_Data_Driven_Test/config_Login.properties");

		// 4. load the properties file
		prop.load(ip);

	}

	@Test
	public void userDirectory() {
		System.out.println("----------------");
		System.out.println(
				"/Users/danilodeiana/eclipse-workspace/My_Pnt_Mar_June_2024_Weekend_Batch/src/test/java/com/automation/Day12_21st_Apr_2024_Data_Driven_Test/config_Login.properties");
		System.out.println("----------------");
	}

	@Test
	public void loginTN() {

		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(prop.getProperty("url"));
		driver.findElement(By.linkText("My Account")).click();
		driver.findElement(By.linkText("Login")).click();
		driver.findElement(By.id("input-email")).sendKeys(prop.getProperty("validEmail"));
		driver.findElement(By.id("input-password")).sendKeys(prop.getProperty("validPassword"));
		driver.findElement(By.cssSelector("input.btn.btn-primary")).click();
		AssertJUnit.assertTrue(driver.findElement(By.linkText("Logout")).isDisplayed());
		softassert.assertAll();

	}
}
