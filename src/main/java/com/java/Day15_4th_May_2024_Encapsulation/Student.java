package com.java.Day15_4th_May_2024_Encapsulation;

public class Student {

	private String name;
	private int age;
	
	public String getData1() {
		return name;
	}
	
	public int getData2() {
		return age;
	}
	
	public void setData(String name, int age) {
		this.name = name;
		this.age = age;
	}
}
