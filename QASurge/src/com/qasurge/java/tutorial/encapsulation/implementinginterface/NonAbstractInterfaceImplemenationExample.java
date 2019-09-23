package com.qasurge.java.tutorial.encapsulation.implementinginterface;

interface Birds1{
	public void legs();
	public void eat();
}

class Sparrow implements Birds1{  // Non Abstract Implementation of interface Birds1
	public void legs() {
		System.out.println("Two legs");
	}
	public void eat() {
		System.out.println("fruits");
	}
}

abstract class PeaCock implements Birds1{  //  Abstract Implementation of interface Birds1
	public void legs() {
		System.out.println("Two legs");
	}
}

public class NonAbstractInterfaceImplemenationExample {

	public static void  main(String[] args) {
		Sparrow sparrow1 = new Sparrow();
		sparrow1.legs();
		sparrow1.eat();
	}
}
