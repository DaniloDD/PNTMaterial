package com.java.Day6_31st_Mar_2024_Controled_Statements_In_Java_Part2;

public class Topic5_What_Is_For_Loop {
	
	public static void whatIsForLoop() {
		// syntax
		/*
		
		for (inizialize; condtion; inc/dec) {	
		}
		
		*/
	}
	
	public static void print1to10() {
		for(int i=1; i<=10; i++) {
			System.out.println(i);     
		}
	}
	
	public static void print100To1() {
		for (int i= 100; i>0; i--) {
			System.out.println(i);
		}
	}
	
	public static void printFirst10EvenNumbers() {
		for (int i = 1; i<=10; i++) {
			System.out.println(2*i);
		}
	}
	
	public static void printFirst100EvenNumbers() {
		for (int i = 1; i<=100; i++) {
			System.out.println(2*i);
		}
	}
	
	public static void printFirst100EvenNumbersAndAddTheSum() {
		int sum = 0;
		for (int i = 1; i<=100; i++) {
			System.out.println("The amount to add is " + (2*i));
			sum = sum + (2*i);
			System.out.println("The partial sum is " + sum);
		}
		System.out.println("The final sum is " + sum);
	}

	public static void main(String[] args) {
		printFirst100EvenNumbersAndAddTheSum();

	}

}
