package com.automation.Day7_6th_Apr_2024_Basics_Of_TestNG;

import org.testng.annotations.Test;
import org.testng.annotations.Test;

// sometimes we need to execute our code multiple times to make sure it works

public class Topic9_Executing_Multiple_Times {
	
	// there are 5 Test cases
	// you want TestCase4 to execute 10 times
	
	@Test(priority=1) 
	public void tc1() {
		System.out.println("Hello World");
	}
	
	@Test(priority=2) 
	public void tc2() {
		System.out.println("Red");
	}
	
	@Test(priority=3) 
	public void tc3() {
		System.out.println("Green");
	}
	
	@Test(priority=4, invocationCount = 10) 
	public void tc4() {
		System.out.println("Blue");
	}
	
	@Test(priority=5) 
	public void tc5() {
		System.out.println("grey");
	}

}
