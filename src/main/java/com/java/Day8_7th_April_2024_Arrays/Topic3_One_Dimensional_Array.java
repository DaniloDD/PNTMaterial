package com.java.Day8_7th_April_2024_Arrays;

public class Topic3_One_Dimensional_Array {
	
	// 1-D []

	public static void main(String[] args) {
		
		// 1. Declaration
		
		// there are different ways of declaration:
		int a[];
		int[] b;
		int[]c;
		
		int[] b1, c1;		// b1 and c1 are 1-D array
		int b2[], c2;		// b2 is a 1-D array and c2 is an integer
		int b3[], c3[];		// they are both 1-D arrays
		
		// 2-D
		int[] b4[], c4[];	// they are both 2-D arrays
		int[] b5, c5[];		// b5 is 1-D and c5 is 2-D
		
		// 2. Creation of Array
		
		// we technically use the key word 'New'
		 //int a1[];
		// a1 = new int[3];
		// Declaration + Creation
		
		int[] a1 = new int[5];
		System.out.println("The size of Array a1 is " + a1.length);
		
		// 3. Initialization
		
		// there are many different ways, the oldest one is:
		a1[0]= 111;
		a1[1] = 222;
		a1[2] = 333;
		a1[3] = 444;
		a1[4] = 555;
		// a1[5] = 666;          	  // ArrayIndexOutOfBoundExeception
		
		// a more efficient way is:
		// Decleare + Create + Initialize  - all in one statement
		int[] a2 = {111, 222, 333, 444};		// the most simple form where the 'new' key is already included
		
		int[] a3 = new int[] {111, 222, 333, 444, 555};		// the new key word is there but is less practical
		
		System.out.println("The size of Array a2 is " + a2.length);
		System.out.println("The size of Array a3 is " + a3.length);
		
		
		// 4. Retrieving elements from an array
		
		String[] S1 = {"Hello", "World", "Java", "Python", "C++", "Eclipse"};
		// i want to print all the elements of the array
		
		for(int i =0; i<S1.length; i++) {
			System.out.println(S1[i]);
		}
		
		// if i want to retrieve the 4th element from the array
		System.out.println("The 4th element of S1 array is " + S1[3]);
		

	}

}
