package com.qasurge.java.tutorial.encapsulation.implementinginterface;

// Can inherits multiple interface but only one class
interface Ball{
	public void methodBall();
} 
interface Bat{
	public void menthodBat();
}
interface Players{
	public void players();
}

abstract class Umpire{
	abstract public void umpireName() ;
}

class Cricket implements Ball, Bat, Players {
	
	public void methodBall() {
		System.out.println("Ball");
	}
	
	public void menthodBat() {
		System.out.println("Bat");
	}
	
	public void players() {
		System.out.println("Players");
	}
	
	public void umpireName() {
		System.out.println("Umpire Name"); 
		
	}
}

public class MultipleInterfaceImplementations {

	public static void main(String[] args) {
		Cricket cricket = new Cricket();
		cricket.methodBall();
		cricket.menthodBat();
		cricket.players();
		cricket.umpireName();
	}
	
}
