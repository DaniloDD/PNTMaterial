package com.java.Day16_5th_May_2024_Date_Scanner_Wrapper;

import java.util.Scanner;

public class Topic2_Scanner {

	// Scanner class is a pre-defined class in java used to take user input while execution happens
	// it comes under the java.util package
	// Scanner class has a lot of in built methods - next(), nextInt(), NextLong()
	// scanner class also supports method chaining
	
	
	public static void main(String[] args) {
		
		// Step 1: create the object of Scanner class and pass System.in parameter in it's constructor
		
		Scanner scan = new Scanner(System.in);
		
		// you want to enter your first name
		
		System.out.println("Enter First Name");
		String firstName = scan.next();
		
		System.out.println("Enter Last Name");
		String lastName = scan.next();
		
		System.out.println("Enter your age");
		int age = scan.nextInt();
		
		System.out.println("Enter Gender");
		// male - string or female - String
		// 'M' or 'F'
		char gender = scan.next().charAt(0);
		
		System.out.println("Enter Mobile Number");
		long mobNum = scan.nextLong();
		
		System.out.println("The first name is: " + firstName);
		System.out.println("The last name is: " + lastName);
		System.out.println("The age is: " + age);
		System.out.println("The gender is: " + gender);
		System.out.println("The phone number is is: " + mobNum);		
		

		
	}

}
