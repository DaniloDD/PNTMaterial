package com.java.Day15_4th_May_2024_Inheritance;

public class Topic2_Parent extends Topic5_Grandparent {
	
	// it will not be part of inheritance
	public Topic2_Parent() {
		int i = 100;
		int j = 200;
		int k = 300;
		System.out.println(i+j+k);
	}
	
	private String name = "Jhon";		// it will not be part of inheritance
	
	public void bungalow() {
		System.out.println();
	}
	
	public void shares() {
		System.out.println("Parent s share");
	}
	
	public void farmHouse() {
		System.out.println("Parent farmhouse");
	}

}
