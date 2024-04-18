package com.automation.Day7_6th_Apr_2024_Basics_Of_TestNG;
import org.testng.annotations.Test;

public class Topic7_Dependencies_Between_TestCases {
	
	// there are total 10 test cases
	// test case 1 has to pass
	// test case 2-10 are dependent on the result of Test Case 1
	// test case 9 is dependent on Test Case 7 and 8's result
	
	
	// how to establish the dependencies between test cases?
	// 1. Priority has to be given
	// 2. There is an annotion in TestNG dependsOnMethod
	
	@Test(priority=1)
	public void tc1() {
		System.out.println("This is test case 1");
		
		// Assert.fail("I am failing the test"); (check what are the consequnces if the firt fails)
	}
	
	@Test(priority=2, dependsOnMethods = "tc1")
	public void tc2() {
		System.out.println("This is test case 2");
	}

	@Test(priority=3, dependsOnMethods = "tc1")
	public void tc3() {
		System.out.println("This is test case 3");
	}
	
	@Test(priority=4, dependsOnMethods = "tc1")
	public void tc4() {
		System.out.println("This is test case 4");
	}
	
	@Test(priority=5, dependsOnMethods = "tc1")
	public void tc5() {
		System.out.println("This is test case 5");
	}
	
	@Test(priority=6, dependsOnMethods = "tc1")
	public void tc6() {
		System.out.println("This is test case 6");
	}
	
	@Test(priority=7, dependsOnMethods = "tc1")
	public void tc7() {
		System.out.println("This is test case 7");
		// Assert.fail();
	}
	
	@Test(priority=8, dependsOnMethods = "tc1")
	public void tc8() {
		System.out.println("This is test case 8");
	}
	
	@Test(priority=9, dependsOnMethods = {"tc1", "tc7", "tc8"} )
	public void tc9() {
		System.out.println("This is test case 9");
	}
	
	@Test(priority=10, dependsOnMethods = "tc1")
	public void tc10() {
		System.out.println("This is test case 10");
	}
}
