package com.java.Day15_4th_May_2024_Abstraction_AbstractClass;

public class Topic4_School extends Topic3_Student{

	public void publicSchoolCourseCurriculum() {
		System.out.println("this is the public school course curriculum");
	}
	
	public void prayerHallAssembly() {
		System.out.println("This is public school assembly");
	}

	@Override
	public void schoolCanteen() {
		System.out.println("student school canteen");
	}

	@Override
	public void schoolPlayground() {
		System.out.println("student school playground");
	}

	@Override
	public void schoolBandPlay() {
		System.out.println("school band play");
	}
	
}
