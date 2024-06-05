package com.java.Day15_4th_May_2024_Abstraction_AbstractClass;

public class Topic5_HomeSchool_Execution {

	// Topic3 Student - this is an abstract class
	// Topic4 School- this is a normal class that extends the abstract
	// Topic5_HomeSchool_Execution - this is the execution class
	
	public static void main(String[] args) {
		
		// can i create the object of an abstract class? No
		
		Topic4_School school = new Topic4_School();
		school.publicSchoolCourseCurriculum();
		school.prayerHallAssembly();
		school.prayerHallAssembly();
		school.studentLibrary();
		school.schoolBandPlay();
		school.schoolCanteen();
		
		// what if we use the parent class reference to refer to the child class object
		Topic3_Student student = new Topic4_School();
		student.age= 10;
		student.name="Jhonny";
		student.schoolBandPlay();
		student.schoolCanteen();
		
		
	}
}
