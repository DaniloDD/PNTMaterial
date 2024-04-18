package com.java.Day10_14th_apr_2024_Methods;

public class Topic4_ReturnTypeInMethods {

	// methods are independent units of execution
	
	public static void main(String[] args) {

		checkPresentOrAbsent();
	}
	
	// the type of return that we have from a methods
	public static int test(int i, int j) {
		int k = i+j;
		System.out.println("The result is " + k);
		return k;
	}
	
	public static boolean checkPresentOrAbsent() {
		boolean b1 = true;
		boolean b2 = false;
		System.out.println(b1==b2);
		return b1 == b2;
	}

}
