package com.java.Day16_5th_May_2024_this_keyword;

public class Topic1_What_is_This_Keyword {

	// this keyword acts as a reference to an object
	// this keyword refers to the current class instance variable
	
	// instance, static, local variable
	
	int age;
	String name;
	private String identity;
	static double height;
	
	
	public static void main(String[] args) {
	
	}
	
	public void setvalues(int ageValue) {
		age = ageValue;
		
	}
	
	public void setValues1(int age) {
		this.age = age;
	}
	
	public void showValue() {
		System.out.println(age);
	}

}
