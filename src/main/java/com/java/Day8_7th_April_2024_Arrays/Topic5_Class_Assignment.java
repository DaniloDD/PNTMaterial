package com.java.Day8_7th_April_2024_Arrays;

public class Topic5_Class_Assignment {

	public static void main(String[] args) {
		// Create a 1-D int array which should have 10 elements
		// Determine the length of this array
		// print all the elements of this array retrieve the 7th and 10th element of this array
		
		
		// create a 2-D String array which should have 2x3
		// determine the length of this array
		// print all the elements of this array
		// retrieve the element in the 2nd row and 3rd col and the element in the 3rd row and 4th col
		
		twoDimArray();
	}
	
	
	public static void oneDimArray() {
		int[] a = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		int length = a.length;
		System.out.println(length);
		
		for (int i =0; i< a.length; i++) {
			System.out.println(a[i]);
		}
	}
	
	public static void twoDimArray() {
		
		int[][] b = {
				{11, 22, 33},
				{44, 55, 66}
		};
		
		System.out.println("The number of rows is : " + b.length);
		
		for (int i = 0; i<b.length; i++) {
			for (int j=0; j<b[i].length; j++) {
				System.out.println(b[i][j]);
			}
		}
	}

}
