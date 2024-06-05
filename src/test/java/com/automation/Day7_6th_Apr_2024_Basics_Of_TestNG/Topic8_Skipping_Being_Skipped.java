package com.automation.Day7_6th_Apr_2024_Basics_Of_TestNG;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.Assert;
import org.testng.annotations.Test;

// how to run a test case depending on another one that is failing

public class Topic8_Skipping_Being_Skipped {
	
	// let s say a TestCase2 is dependent on another TestCase1
	// That TestCase1 is failing for some logical error - so technically TestCase2 will be skipped
	
	// But what if I still want TestCase2 to run even though it is dependent on TestCase1 which is failing
	// i do not want TestCase2 to skip. What should i do?
	
	@Test(priority=1)
	public void tc1() {
		System.out.println("Hello");
		AssertJUnit.fail();
		
	}
	
	@Test(priority=2, dependsOnMethods = "tc1", alwaysRun=true)
	public void tc2() {
		System.out.println("Blue");
	}
	
	
	@Test(priority=2, dependsOnMethods = {"tc1", "tc2"}, alwaysRun=true, enabled = false) 
	// in this case 'enable= false' is stronger than alwaysRun so it will be switched off
	public void tc3() {
		System.out.println("Ocean");
	}

}
