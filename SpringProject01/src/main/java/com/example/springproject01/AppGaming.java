package com.example.springproject01;

public class AppGaming {

	public static void main(String[] args) {
		//SuperMario game = new SuperMario();
		Pacman game = new Pacman();
		//Snake game = new Snake();
		GameRunner  runner= new GameRunner(game);
		runner.run();
	}

}
