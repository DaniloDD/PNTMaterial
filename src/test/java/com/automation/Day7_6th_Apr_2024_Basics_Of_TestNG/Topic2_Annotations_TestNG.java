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

public class Topic2_Annotations_TestNG {

	// what do you need for annotations?
	// In TestNG (Test Next Generation), annotations are special markers or directives that provide metadata about how a 
	// method should be run or treated during the test execution process. Annotations in TestNG are similar to annotations 
	// in other programming languages like Java, but they are specifically designed for test automation.
	
	// The always start with an '@' symbol

	// https://testng.org/annotations.html

	// Suite - your whole test bed
	// Test - what you want to test (Functionality)
	// Class - you decide the specific logic which may have more logics inside it
	// Method - this is your individual logic
	// TestCase -
	
	// Execution Order: 
	// BeforeSuite > BeforeTest > BeforeClass > BeforeMethod > Test > AfterMethod > AfterClass > AfterTest > AfterSuite
	

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
	
	@BeforeMethod
	public static void beforeMethodLearning() {
		System.out.println("This will be printed once before each test case");
	}
	
	
	// this is like the main test
	@Test
	public void testCase() {
		System.out.println("This is the test case1");
	}
	
	// whatever come after uses the @After
	
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
