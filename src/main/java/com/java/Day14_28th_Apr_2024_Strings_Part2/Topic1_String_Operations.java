package com.java.Day14_28th_Apr_2024_Strings_Part2;

public class Topic1_String_Operations {

	public static void main(String[] args) {
		containsMethod();
		
	}

	public static void subStringMethod() {
		String S1 = "The sky is blue";
		System.out.println(S1.substring(5));
		System.out.println(S1.substring(5, 9));
	}

	public static void replaceMethod() {
		String s1 = "this is cold";
		System.out.println(s1.replace("is", "was"));
	}

	public static void replaceFirstMethod() {
		String s1 = "this is cold";
		System.out.println(s1.replaceFirst("is", "was"));
	}

	public static void replaceAllMethod() {
		String s1 = "This is cold and is windy";
		System.out.println(s1.replaceAll("is(.)", " was "));
		System.out.println(s1.replaceAll("is(.*)", "was"));
		System.out.println(s1.replaceAll(" ", "_").replaceAll("_", "+"));
	}

	public static void indexOfMethod() {
		// total length of the string - represent total charcaters in teh string
		// each character is taking up an index position
		String s1 = "This is Selenium";
		System.out.println(s1.indexOf('S'));
		System.out.println(s1.indexOf("Selenium"));
	}

	public static void lastIndexOfMethod() {
		String s1 = "This is Selenium";
		System.out.println(s1.lastIndexOf('e'));
	}

	public static void containsMethod() {
		String s1 = "Hello";
		String s2 = "Hello";
		System.out.println(s1.contains(s2));
	}

	public static void charAtMethod() {
		String s1 = "This is Selenium";
		System.out.println(s1.charAt(12));
	}

	public static void endsWithMethod() {
		String s1 = "This is Selenium";
		System.out.println(s1.endsWith("nium"));	// true
	}

	public static void startsWithMehtod() {
		String s1 = "This is Selenium";
		System.out.println(s1.startsWith("Thi"));	// true
	}

	/*
	 * 
	 * homework 
	 * methods 
	 * toLowerCase(); toUpperCase(); valueOf(); toCharArray();
	 * StringBuffer Class
	 * StringBuilder Class
	 * methods inside StringBuilder and StringBuffer classes
	 * String vs StringBuffer vs StringBuilder
	 */

}
