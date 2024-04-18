package com.java.Day10_14th_Apr_2024_Strings;

public class Topic4_Passoword_Protection {

	public static void main(String[] args) {
		String S1 = new String("Selenium@123");
		System.out.println("The password is " + S1);
		
		S1 = S1.concat("Donkey@123");
		System.out.println("The updated password is " + S1);
		
		
		// if given the chance will you store the password in a string or a char array?
		// you store a pw in a char array because it encrypts the output password
		
		String SP = "Password";
		System.out.println("The passowrd stored in a String format is " + SP);
		
		char[] c = {'P', 'a', 's', 's', 'w', 'o', 'r', 'd'};
		System.out.println("The password stored in a character array format is : " + c);

	}

}
