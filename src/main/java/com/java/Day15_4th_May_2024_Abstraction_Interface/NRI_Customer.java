package com.java.Day15_4th_May_2024_Abstraction_Interface;

//can an abstract class implement an interface? YES
public abstract class NRI_Customer implements SecretBankingLogic{

	public abstract void nriloans();
	public abstract void nricards();

	// interface can be implemented by a normal class or an abstract one as well.
}
