package com.java.Day16_5th_May_2024_Date_Scanner_Wrapper;

import java.util.Scanner;

public class Topic2_Assignment {

	public static void main(String[] args) {
		// addition, subtraction, multiplication, division using scanner class
		// take two numbers - number1 and number2

		Scanner scan = new Scanner(System.in);

		System.out.println("Enter first number");
		int num1 = scan.nextInt();

		System.out.println("Enter second number");
		int num2 = scan.nextInt();

		System.out.println("Choose the mathematical operator(+, -, *, /, resultDivByZero)");
		String mathOp = scan.next();

		int result;
		String resultDivByZero;

		switch (mathOp) {
		case "+":
			result = num1 + num2;
			System.out.println(result);
			break;

		case "-":
			result = num1 - num2;
			System.out.println(result);
			break;

		case "*":
			result = num1 * num2;
			System.out.println(result);
			break;

		case "/":
			result = num1 / num2;
			System.out.println(result);
			break;

		case "resultDivByZero":
			result = num1 / num2;
			System.out.println(result);
			break;

		default:
			System.out.println("number 2 is zero");
			break;
		}
	}

}
