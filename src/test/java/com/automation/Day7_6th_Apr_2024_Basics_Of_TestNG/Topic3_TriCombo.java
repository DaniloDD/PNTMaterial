package com.automation.Day7_6th_Apr_2024_Basics_Of_TestNG;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Topic3_TriCombo {
	
	// what comes before it is not used commonly
	@BeforeSuite
	public void beforeSuiteLearning() {
		System.out.println("This will be printed first");
	}

	@BeforeTest
	public void beforeTestLearning() {
		System.out.println("This will be printed second");
	}

	@BeforeClass
	public static void beforeClassLearning() {
		System.out.println("This will be printed third");
	}
	
	
	
	// BeforeMethod, Test, AfterMethod are the three most important annotations 
	// BeforeMethod and AfterMethod are not mandatory but they usually always there
	
	
	@BeforeMethod
	public static void beforeMethodLearning() {
		System.out.println("This will be printed once before each test case");
	}
	
	
	// this is like the main test
	@Test
	public void testCase1() {
		System.out.println("This is the test case1");
	}
	@Test
	public void testCase2() {
		System.out.println("This is the test case1");
	}
	@Test
	public void testCase3() {
		System.out.println("This is the test case3");
	}
	
	
	
	
	
	// whatever come after it is not commonly used
	
	@AfterMethod
	public void afterMethodLearning() {
		System.out.println("This will be printed once after each test case");
	}
	
	@AfterClass
	public void afterClassLearning() {
		System.out.println("This will be printed after teh AfterMethod annotation");
	}
	
	@AfterTest
	public void afterTestLearning( ) {
		System.out.println("This will be printed after teh AfterClass annotation");
	}
	
	@AfterSuite
	public void afterSuiteLearning() {
		System.out.println("This will be printed after teh AfterTest annotation");
	}

}
