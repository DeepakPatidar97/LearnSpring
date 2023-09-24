package com.springcore.App1Game;

public class GameRunner extends PacMan{
	
	/*
	 * MarioGame game;
	 * 
	 * SuperContraGame superGame;
	 */
	
	GameConsole game;


	GameRunner(GameConsole game){
		this.game = game;
	}
	
	
	public void run() {
		System.out.println("ruuning game "+ game);
	}
	
}
