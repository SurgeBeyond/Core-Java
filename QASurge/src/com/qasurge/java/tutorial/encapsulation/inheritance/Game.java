package com.qasurge.java.tutorial.encapsulation.inheritance;

// Polymorphism

public class Game {

	public void play() {
		System.out.println("Play Game");
	}
}

class FootBall extends Game {

	public void play() {
		System.out.println("Play FootBall");
	}
}

class Cricket extends Game {

	public void play() {
		System.out.println("Play Cricket");
	}
}

class GameExample{
	public static void main(String[] args) {
		Game game = new FootBall();
		playGames(game);
	}
	
	static void playGames(Game game) {
		game.play();
	}
}
