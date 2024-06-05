package com.java.Day15_4th_May_2024_Abstraction_Interface;

// one class can implement multiple interfaces at the same time
// one class can extends an abstract class while implementing interfaces

public class Human_Customer extends NRI_Customer implements SecretBankingLogic, HiddenCreditUnionService{

	// whenever a class implements an interface than it acts as the implementing class
	
	
	@Override
	public void secretCode() {
		
		
	}

	@Override
	public void secretName() {
		
		
	}

	@Override
	public void carLoan() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void homeLoan() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void nriloans() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void nricards() {
		// TODO Auto-generated method stub
		
	}

}
