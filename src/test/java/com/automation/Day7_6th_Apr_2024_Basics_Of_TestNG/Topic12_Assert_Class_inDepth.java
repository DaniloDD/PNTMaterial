package com.automation.Day7_6th_Apr_2024_Basics_Of_TestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Topic12_Assert_Class_inDepth {
	
	@Test
	
	public void login() {
		System.out.println("A is the first letter");
		Assert.fail();  	// here code will stop. Code will not go into other lines inside this method.
		System.out.println(1+2);
		
	}

}
