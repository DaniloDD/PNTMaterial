package com.java.Day15_4th_May_2024_Abstraction_Interface;

//Abstraction
	// Hiding internal implementation and just highlighting setup services
	
	// There are 2 way to achieve abstraction:
	// 1. Abstract Class (0 to 100% abstraction)
	// 2. Interface (it is always 100% abstraction) 		--> this is why we use WebDriver (which is an interface) instead of ChromeDriver (which is a class)
	
	// interface is a blueprint of a Class --> a high-lavel overview
	// a class defines much more in depth
	// interface has definitions but it does not expose those definitions
	// the variables inside an interface are public, static and final in nature
	
	// variables
	// java8 - default concrete methods were allowed, static concrete methods were allowed
	// java9 - private concrete methods were allowed

public interface SecretBankingLogic {

	public static final int i =10;
	
	default void helloWorld() {	
	}
	
	public void secretCode();
	public abstract void secretName(); 		// in interface it does not need the keyword abstract

	// are protected and private abstract methods allowed in interface? NO
	
	
	
}
