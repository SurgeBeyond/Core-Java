package com.qasurge.java.tutorial.encapsulation.referencevariablecasting;

class Car{}

class Maruti extends Car{}

public class CompilesButFailsLater {

	public static void main(String[] args) {
		Maruti maruti;
		Car car = new Car();
		
		maruti = (Maruti) car;
	}
}