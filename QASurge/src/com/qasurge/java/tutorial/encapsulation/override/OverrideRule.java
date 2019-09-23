package com.qasurge.java.tutorial.encapsulation.override;

class Animal {
	public void eat() {
		System.out.println("Eat");
	}
}

class Elephant extends Animal {
	/*
	 * private void eat() { System.out.println("Eating not allowed"); }
	 */
}

public class OverrideRule {

	public static void main(String[] args) {

		Animal elephant = new Elephant();
		elephant.eat();
	}
}
