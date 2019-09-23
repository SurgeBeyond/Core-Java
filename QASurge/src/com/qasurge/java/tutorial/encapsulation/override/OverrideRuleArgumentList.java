package com.qasurge.java.tutorial.encapsulation.override;

class Fruit {

	public void fruit(String name, int noOfFruits) {
		System.out.println(name + " : " + noOfFruits);
	}
}

class Apple extends Fruit {

	// Override Example
	// Argument List must exactly match similar to that of overridden method.
	// Otheriwse, method will become overloaded.
	public void fruit(String name, int noOfFruits) {
		System.out.println("*** OVERRIDE ***: " + name + " : " + noOfFruits);
	}

	// Overload Example
	public void fruit(int noOfFruits, String name) {
		System.out.println("*** OVERLOAD ***: " + name + " : " + noOfFruits);
	}

	// Overload Example
	public void fruit(String name, int noOfFruits, int weight) {
		System.out.println("*** OVERLOAD ***: " + name + " : " + noOfFruits+" : "+ weight);
	}
}

public class OverrideRuleArgumentList {

	public static void main(String[] args) {
		Fruit apple = new Apple();
		apple.fruit("Apple", 2);
	}
}
