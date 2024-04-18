package com.java.Day8_7th_April_2024_Arrays;

public class Topic4_Two_Dimensional_Arrays {

	public static void main(String[] args) {
		explanation();
		
		int[][] a1;
		int a2[][];
		int[][] a3;
		int[][] a4;
		int[] a5[];
		int[] a6[];

		int[][] b1, c1; // they are both 2-D
		int[] b2, c2[]; // b2 is 1-D and c2 is 2-D
		int[] b3[], c3[];
		int[][] b4, c4[]; // b4 is 2-D and c4 is 3-D
		// int[][]b5, []c5; // the law of array in java is that the 2nd variable cannot
		// have a dimension before it
	}

	public static void explanation() {
		int[][] a = new int[3][4]; // Declared + inizialized
		// matrix 3 * 4 =12 elements

		// initialization
		a[0][0] = 11;
		a[0][1] = 22;
		a[0][2] = 33;
		a[0][3] = 44;

		a[1][0] = 55;
		a[1][1] = 66;
		a[1][2] = 77;
		a[1][3] = 88;

		a[2][0] = 99;
		a[2][1] = 111;
		a[2][2] = 222;
		a[2][3] = 333;

		// declaration, creation and intialization in the same line

		int[][] b = { 
					{ 11, 22, 33, 44 }, 
					{ 55, 66, 77, 88 }, 
					{ 99, 111, 222, 333 } 
					};
		
		int[][] c = new int[][] { { 11, 22, 33, 44 }, { 55, 66, 77, 88 }, { 99, 111, 222, 333 } };
		
		
		// Print all elements of array b
		for (int i =0; i<a.length; i++) {
			for (int j =0; j<a[i].length; j++) {
				System.out.println("the number of elements/columns per row is " + a[i].length);
				System.out.println(a[i][j] + " ");
			}
			
		}
		
		// retrieve the element which is in 2nd row and 3rd column    --> 77
		// n-1 concept has to be used
		int x = b[1][2];
		System.out.println("The element will be in : " + x);
		
		
	}
}
