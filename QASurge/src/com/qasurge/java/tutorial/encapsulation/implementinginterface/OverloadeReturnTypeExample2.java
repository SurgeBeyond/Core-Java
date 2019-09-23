package com.qasurge.java.tutorial.encapsulation.implementinginterface;

class State{
	
	void population() {
		System.out.println("Population");
	}
}

class Country extends State{
	
	// Illegal Cant change only return type
	/*String population() {
		System.out.println("Country");
		return "Country";
	}*/
}


public class OverloadeReturnTypeExample2 {

}
