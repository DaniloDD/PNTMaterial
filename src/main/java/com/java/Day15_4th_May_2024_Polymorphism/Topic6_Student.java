package com.java.Day15_4th_May_2024_Polymorphism;


public class Topic6_Student extends Topic5_School{

	public static void main(String[] args) {
		Topic6_Student student = new Topic6_Student();
		student.education();
		student.annualFunction("Halloween", "Diwali", "Prom night");
	}
	
	
	// method overriding
	// child method is overriding the parent s class
	public void education() {
		System.out.println("Student's education");
	}
	
}
