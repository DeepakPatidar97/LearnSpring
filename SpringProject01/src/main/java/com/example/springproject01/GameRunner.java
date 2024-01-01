package com.example.springproject01;

public class GameRunner {
	
	//SuperMario game;
	//Snake game;
	Pacman game;
	public GameRunner(Pacman game) {
		this.game = game;
	}
	
	public void run() {
		System.out.println("Game is "+game.getClass());
		game.down();
		game.up();
		game.left();
		game.rigth();
	}
	
}
