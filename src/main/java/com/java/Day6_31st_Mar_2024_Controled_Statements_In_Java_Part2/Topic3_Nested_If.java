package com.java.Day6_31st_Mar_2024_Controled_Statements_In_Java_Part2;

public class Topic3_Nested_If {

	public static void main(String[] args) {
		
		// leap year
		// 3 nested conditions:
		// if it is divisible by 4
		// if it is divided by 4 than check whether it is divisible by 100
		// if it is divisible by 100 check whether it is divisible by 400
		
		int year = 2016;
		
		if (year % 4 == 0) {
			if(year % 100 == 0) {
				if (year % 400 == 0) {
					System.out.println("The final condition is satisfied and it is a leap year" + year);
				}
			}
		}
		else {
			System.out.println(year + " is not a leap year");
		}
	
	}

}
