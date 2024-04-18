package com.java.Day4_24th_Mar_2024_Control_Statements_In_Java;

public class Topic2_ConditionalStatements {

	public static void main(String[] args) {
		

	}
	
	public static void ifStatement() {
		// you type if (condition)
		// if the condition is true than control will go inside the body of the if block=
		// if the condition is false than control will not go inside the body of the if block
		// than else block will come to help
		// 
		
		/*
		
		if(2<3) {
			System.out.println("2 is smaller than 3");
		}
		else {
			System.out.println("I think the if condition is not true so let me handle this");
		}
		*/
		
	}
	
	public static void firstIfStatementAssignement() {
		int i =10;
		int j=20;
		int k=30;
		// Find out the largest number using if and else
		
		if (i>j && i>k) {
			System.out.println("i is greatest number :" + i);
		}
		else if (j>i && j>k) { // here it is proved j is not the greatest
			System.out.println("j is greatest number : " + j);
		}
		else {
			System.out.println("k is greatest : " + k);
		}
	}
	
	public static void secondAssignement() {
		int i =10;
		int j=20;
		int k=30;
		int l = 40;
		
		// find the smallest number
		if (i<j && i<k && i<l) {
			System.out.println("i is the smallest :" + i);
		}
		else if (j<i && j<k && j<l) {
			System.out.println("j is the smallest :" + j);
		}
		else if (k<i && k<j && k<l) {
			System.out.println("k is the smallest :" + k);
		}
		else {
			System.out.println("l is the smallest : " + l);
		}
		
	}
	/*
	public static void determineLeapYear() {
		int year1 = 1900;
		int year2 = 1996;
		int year3 = 2002;
		int year4 = 2000;
		
	}
	*/

}
