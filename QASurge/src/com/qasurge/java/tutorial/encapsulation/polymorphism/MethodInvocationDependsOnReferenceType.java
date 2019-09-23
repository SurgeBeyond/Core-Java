package com.qasurge.java.tutorial.encapsulation.polymorphism;

class Ball {
	public void ball() {
		System.out.println("Ball");
	}
}

class Cricket extends Ball {
	public void cricket() {
		System.out.println("Cricket");
	}
}

//A reference variable's type determines the methods that can be invoked on
//the object the variable is referencing.
public class MethodInvocationDependsOnReferenceType {

	public static void main(String[] args) {
		Ball ball1 = new Ball();
		ball1.ball();

		Ball ball2 = new Cricket();
		ball2.ball();
		// ball2.cricket();
	}

}
