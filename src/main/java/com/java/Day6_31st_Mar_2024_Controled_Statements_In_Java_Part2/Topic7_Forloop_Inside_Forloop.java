package com.java.Day6_31st_Mar_2024_Controled_Statements_In_Java_Part2;

public class Topic7_Forloop_Inside_Forloop {

	public static void understandingNestedForLoop() {
		// for loop inside for loop
		// outer for loop
		// inner for loop
		// login - for every 1 iteration of outer for loop, inner for loop executes for
		// all iterations

	}

	public static void simpleExample() {
		for (int i = 1; i <= 5; i++) {
			System.out.println("This is the outer for loop and i am printing the values : " + i);

			for (int j = 1; j <= 5; j++) {
				System.out.println("The value of inner for loop is : " + j);
			}
		}
	}

	public static void starPatternProgram1() {

		for (int j = 1; j <= 5; j++) {
			System.out.print("*");

		}
		System.out.println();
	}

	public static void starPatternProgram2() {
		for (int i = 1; i <= 5; i++) {

			for (int j = 1; j <= i; j++) {
				System.out.print("*");

			}
			System.out.println();
		}
	}

	public static void starPatternProgram3() {
		for (int i = 1; i <= 5; i++) {

			for (int j = i; j <= 5; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	public static void starPatternProgram4() {
		for (int i = 1; i <= 5; i++) {

			for (int j = 1; j <= i; j++) {
				System.out.print("*");

			}
			System.out.println();
		}
		for (int i = 1; i <= 5; i++) {

			for (int j = i; j < 5; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		starPatternProgram4();
	}

}
