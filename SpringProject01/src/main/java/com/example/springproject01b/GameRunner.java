package com.example.springproject01b;

public class GameRunner {
	
	private GameConsole game;
	
	public GameRunner(GameConsole game) {
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
