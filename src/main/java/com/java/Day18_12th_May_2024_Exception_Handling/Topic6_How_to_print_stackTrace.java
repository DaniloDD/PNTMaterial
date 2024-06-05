package com.java.Day18_12th_May_2024_Exception_Handling;

public class Topic6_How_to_print_stackTrace {

	public static void main(String[] args) {
		try {
			int a = 10;
			int b = 0;
			int c = a/b;
			System.out.println(c);
		} catch (Exception e) {
			e.printStackTrace();				// this will print Exceptionname, Description and stack trace
			System.out.println(e);				// this will printy the ExceptionName, Description only
			System.out.println(e.toString()); 	// the same as above
			System.out.println(e.getMessage()); // only description
			
		}
	}
}
