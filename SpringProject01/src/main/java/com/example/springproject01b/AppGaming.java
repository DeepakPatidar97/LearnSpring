package com.example.springproject01b;

public class AppGaming {

	public static void main(String[] args) {
		GameConsole game = (GameConsole) new Snake();
		GameRunner  runner= new GameRunner(game);
		runner.run();
	}

}
