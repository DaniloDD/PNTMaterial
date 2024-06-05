package com.java.Day16_5th_May_2024_Date_Scanner_Wrapper;

public class Topic5_Boxing_Unboxing_Autoboxing_Autounboxing {
	
	// int - Integer
	// long _ Long
	// double - Double
	// short - Short
	// boolean - Boolean
	// char - Char
	// float - Float
	// byte - Byte

	// the parent of all pre-defined classes in java is object class
	
	public static void main(String[] args) {
		boxingExample();
		autounboxingExample();
		autoboxingExample();
		unboxingExample();
	}
	
	public static void boxingExample() {
		// what is boxing?
		// conversion of primitive data type to Wrapper class object
		// how will we convert a primitive data type to a wrapper class?
		int a = 100;
		Integer b = Integer.valueOf(a);		// here the a int data type has been converted
		
		System.out.println("The wrapper class object is : " + b);
		
	}
	
	public static void autoboxingExample() {
		int a = 100;
		Integer b = a;
		System.out.println("The wrapper class object is : " + b);
	}
	
	// conversion of wrapper class object to primitive data type
	public static void unboxingExample() {
		Integer result = 100;
		int newResult = result.intValue();
	}
	
	public static void autounboxingExample() {
		Integer result = 100;
		int newResult = result;
	}
	
}
