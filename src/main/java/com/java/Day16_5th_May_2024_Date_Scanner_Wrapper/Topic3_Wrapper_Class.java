package com.java.Day16_5th_May_2024_Date_Scanner_Wrapper;

import java.util.ArrayList;

public class Topic3_Wrapper_Class {
	// what is wrapper class
	// types of wrapper class
	// why we need it
	// what is boxing, unboxing, auto-boxing, and auto-unboxing
	// what is parsing

	// java defines 8 primitive data types with their relative wrapper classes

	// int - Integer
	// long _ Long
	// double - Double
	// short - Short
	// boolean - Boolean
	// char - Char
	// float - Float
	// byte - Byte

	// What are Wrapper Classes?

	public static void main(String[] args) {

		int a = 10;
		System.out.println("the p[rimitive data type value is : " + a);
		
		Integer b = 20;
		System.out.println("The wrapper class object is : " + b);
		
		// to store objects let s use arraylist by giving the value with wrapperclass
		ArrayList<Integer> arrayList = new ArrayList<Integer>();
		
		
	}

	// why do we need wrapper classes?
	// when we use collection frameworks, we at times need to convert the primitive data types into Objects and vice versa.
	// 
}
