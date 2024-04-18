package com.java.Day4_24th_Mar_2024_Control_Statements_In_Java;

// a year is a leap year if is divisible by 4 but not by 100

public class Exercise_LeapYear {

	public static void main(String[] args) {
		
		int year = 2024;
		boolean leapYearCondition = isLeapYear(year);
		
		if (leapYearCondition) {
			System.out.println(year + " is a leap year.");
		}
		else {
			System.out.println(year + " is not a leap year.");
		}

	}

	public static boolean isLeapYear(int year) {
		
		boolean leapYearCondition = ((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0);
		
		return leapYearCondition;
	}
}
