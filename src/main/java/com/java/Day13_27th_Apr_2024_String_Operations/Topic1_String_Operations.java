package com.java.Day13_27th_Apr_2024_String_Operations;

public class Topic1_String_Operations {

	public static void main(String[] args) {
		joinMethod();
	}

	public static void lengthMethod() {
		String S1 = "I am learning Automation";
		System.out.println(S1.length()); // just checks the total number of characters
		// String S2 = null;
		// System.out.println(S2.length());
	}

	// it removes the spaces in the beginning and end of the string, not in the
	// middle
	public static void trimMethod() {
		String S1 = "     I am learning		 Selenium with Java     ";
		System.out.println(S1.trim());
	}

	public static void trimAndLengthMethodTogether() {
		String S1 = "		We are learning automation with Slelenium Java		";
		System.out.println("The length of the string before trim operation is: " + S1.length());
		String S2 = S1.trim();
		System.out.println("The lenght after the trim operation is: " + S2.length());
		// or we can do directly
		// syso(S1.trim().length())
	}
	
	public static void isEmptyMethod() {
		String S1 = "";
		System.out.println("To check S1 is empty or not : " + S1.isEmpty());
		boolean b1 = S1.isEmpty();
		System.out.println(b1);
	}
	
	public static void equalsMethod() {
		String S1 = "Orange";
		String S2 = "Orange";
		System.out.println("Checking if the two strings are the same: " + S1.equals(S2));
	}
	
	public static void equalsIgnoreCaseMethod() {
		String S1 = "Orange";
		String S2 = "ORANGE";
		System.out.println("Checking equals method ignoring uppercase or lowecase charcater difference: " + S1.equalsIgnoreCase(S2));
	}
	
	// no of characters in S1 - no of characters in S1
	public static void compareToMethod() {
		String S1 = "Blue";
		String S2 = "Blue Lagoon";
		System.out.println("Comparing two strings: " + S1.compareTo(S2));
	}
	
	public static void compareToIgnoreCaseMethod() {
		String S1 = "Blue";
		String S2 = "BLUE";
		System.out.println("Comparing two strings: " + S1.compareToIgnoreCase(S2));
	}
	
	public static void concatMethod() {
		String S1 = "Hello";
		String S2 = " ";
		String S3 = "World";
		System.out.println("Concatenation these Strings: " + S1.concat(S2).concat(S3));
	}
	
	public static void joinMethod() {
		String S1 = "Hello";
		String S2 = "World";
		String S3 = "Java";
		System.out.println(String.join(":", S1, S2, S3));		//Hello:World:Java
		System.out.println(String.join("_", S1, S2, S3));		//Hello_World_Java
	}

}
