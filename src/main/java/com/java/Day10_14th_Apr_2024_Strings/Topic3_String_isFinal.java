package com.java.Day10_14th_Apr_2024_Strings;

public class Topic3_String_isFinal {

	public static void main(String[] args) {
		// final is a keyword in java
		// once you declare something final than that stays. It cannot change

		int i = 10;
		i = 11;
		System.out.println(i);
		
		final int j = 10;		// it will be immutable
		
		String S1 = new String("Orange");
		S1.concat("Mango");
		System.out.println(S1);
		
		// String is immutable, the final attribute is included
		// whenever we make a change to a String we create a new one, we don't change the original one
		
		
	}

}
