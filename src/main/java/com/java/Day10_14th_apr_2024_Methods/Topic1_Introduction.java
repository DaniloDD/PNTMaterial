package com.java.Day10_14th_apr_2024_Methods;

public class Topic1_Introduction {

	// they are independent units of executions
	// how many types of methods are there?
	// technically there are two:
	// 1. Concrete method
	// 2. Unimplemented method - a method which does not have a body
	

	
	
	
	public static void main(String[] args) {

		logicStarts();
		Topic1_Introduction.logicStarts();
		logicMidway();
		logicEndPart();
	}
	
	
	public static void logicStarts() {
		System.out.println("This is the beginning");
	}
	
	public static void logicMidway() {
		System.out.println("This is the middle");
	}
	
	public static void logicEndPart() {
		System.out.println("This is the end");
	}

}
