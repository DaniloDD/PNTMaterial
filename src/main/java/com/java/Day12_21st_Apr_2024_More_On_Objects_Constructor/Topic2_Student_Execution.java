package com.java.Day12_21st_Apr_2024_More_On_Objects_Constructor;

public class Topic2_Student_Execution {

	// let s give all non static entities
	String name;
	int age;
	boolean promotion;
	String classEnrolment;
	String primarySubject;
	
	
	
	public static void main(String[] args) {
		Topic3_Student_Logic student = new Topic3_Student_Logic();
		student.name = "Tom";
		student.age = 10;
		student.promotion = true;
		student.classEnrollment = "5thGrade";
		student.primarySubject = "Science";
		student.studentDataBaseConnectivity();	// you can call this method directly or in a static way
		Topic3_Student_Logic.studentDataBaseConnectivity();	  // use the ClassName along with the static way 
		
		student.studentAdminData();
		
		// what is the purpose of this (.) operator?
		// it is known as calling operator, it calls Objects
		

	}

}
