package com.java.Day11_20th_Apr_2024_CLasses_And_Objects;

public class School {
	// create a class
	// make sure it has the main method
	// create 2 static variables and 2 non static variable of this class
	// create 2 static methods
	// create 2 non static methods
	// create 3 objects of this class
	// call all the static entities directly inside the main method
	// call all the non static entitites using the object references
	// call static entities within each other
	// call non static entities within each other
	// call static entities within non static entities
	// use the object references to call static entities and not down the warning
	// create an Adjacent class and try to create an object of that class and try
	// calling it

	static int totalStudents;
	static String nameOfTheSchool;
	static int teachers;
	String nameOfTheCity;
	int numTeachersKG;
	int numTeachersFG;
	int numTeachersSG;
	int numTeachersTG;

	public static void main(String[] args) {

		int kindergarden = 20;
		int fGrade = 25;
		int sGrade = 22;
		totalStudents(kindergarden, fGrade, sGrade);	
		nameOfTheSchool();
		
		School kidsSchool = new School();
		kidsSchool.nameOfTheCity();
		kidsSchool.numTeachersKG = 2;
		
		kidsSchool.totalTeachers(kindergarden, fGrade, sGrade);
		
	}
	
	public static void totalStudents(int kindergarden, int fGrade, int sGrade) {
		System.out.println("The total number of students till thrid grade is : " + (kindergarden + fGrade + sGrade));
	}
	
	public static void nameOfTheSchool() {
		nameOfTheSchool = "greenBriar";
		System.out.println(nameOfTheSchool);
	}
	
	public void nameOfTheCity() {
		nameOfTheCity = "Fairfax";
		System.out.println("The school is in " + nameOfTheCity);
	}
	
	public void totalTeachers(int kindergarden, int fGrade, int sGrade) {
		
		
	}

}


class Gym {
	
}