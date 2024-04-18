package com.java.Day3_23rd_Mar_2024_Basics_Of_Java;

public class Topic11_Increment_Decrement_Operators {

	// ++ means +1
			// -- means -1
			// post increment i++
			// pre increment ++i
			// post decrement i--
			// pre decrement --i
	
	public static void main(String[] args) {
		
		int i = 1;
		
		System.out.println(i);
		i++;
		System.out.println(i);
		++i;
		System.out.println(i);
		i--;
		System.out.println(i);
		--i;
		System.out.println(i);
		
		// int j = i++ + ++i;
		// System.out.println(j);
		
		int j = i++;
		System.out.println(j);
		System.out.println(i);
		
		int k = ++i;
		System.out.println(k);
		System.out.println(i);
		
		
		int l = i++ + ++i + i++ + ++i;
		System.out.println(l);
		System.out.println(i);

	}
	
	public static void example() {
		int i = 10;
		int j = --i;
		int k = i++ - --j;
		int l = --i - --i + ++j - --k;
		
		System.out.println(i);
		System.out.println(j);
		System.out.println(k);
		System.out.println(l);
	}
	
	// public static void example2() {
		// int i = 1;
		// int j = i-- + --i;
		// int k = i++ + --i - j++ + ++j;
		// int l = i++ + j++ + k++ - --i - --j - --k;
	//}
	
}