package com.automation.Day11_20th_Apr_2024_SoftAssert_in_TestNG;


import org.testng.AssertJUnit;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Topic1_SoftAssert_TestNG {
	
	// Assert - hard assert --> if the condition true is not met, it will not exectue the rest
	
	// SoftAssert
	
	public WebDriver driver;
	
	@Test
	public void logicOfAssert_vs_SoftAssert() {
		int a = 10;
		int b = 20;
		System.out.println(a+b);
		AssertJUnit.assertTrue(1==2);	// Assert will not allow any line of code to be execute in that method once the condition becomes false
		System.out.println("The sky is blue");
	}
	
	@Test
	public void checkingSoftAssertions() {
		int a = 10;
		int b = 20;
		System.out.println(a+b);
		
		// create the object of SoftAssert class
		SoftAssert softassert = new SoftAssert();
		AssertJUnit.assertTrue(1 == 2);
		// it will still allow the following lines if it fails
		System.out.println("The sky is blue");
	}

}
