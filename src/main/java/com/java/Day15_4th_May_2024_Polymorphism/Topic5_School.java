package com.java.Day15_4th_May_2024_Polymorphism;

public class Topic5_School {

	// rule of method overriding or dynamic polymorphism:
	
	// 1. method name should be the same
	// 2. class has to be different
	// 3. arguments have to be the same
	// 4. inheritance has to be there
	
	public void education() {
		System.out.println("School's education");
	}
	
	public void mandatoryFields(int fee) {
		System.out.println("School mandatory fields");
	}
	
	public void annualFunction(String smallGrade, String midSenior, String senior) {
		System.out.println("school annual function");
	}
	
}
