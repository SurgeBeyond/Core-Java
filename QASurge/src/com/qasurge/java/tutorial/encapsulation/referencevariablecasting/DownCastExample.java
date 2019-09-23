package com.qasurge.java.tutorial.encapsulation.referencevariablecasting;

class Ball{
	public void game() {
		System.out.println("Ball");
	}
}

class FootBall extends Ball{
	public void players() {
		System.out.println("Players");
	}
}

public class DownCastExample {

	public static void main(String[] args) {
		Ball footBall = new FootBall();
		FootBall footBall2 = (FootBall) footBall; // Down cast
		
		footBall2.players(); // Access example 1
		((FootBall) footBall).players(); // Access example 2
		
	}
	
}
