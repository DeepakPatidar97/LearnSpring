package com.springcore.App1Game;

public class AppGamingBasicJava {

	public static void main(String[] args) {

//		MarioGame game = new MarioGame();
//		GameRunner gamerunner = new GameRunner(game); // gamerunner.run();
//		System.out.println(gamerunner.up());
//		System.out.println(gamerunner.down());
//		System.out.println(gamerunner.left());
//		System.out.println(gamerunner.right());

		/*
		 * SuperContraGame game = new SuperContraGame(); GameRunner gamerunner = new
		 * GameRunner(game); //gamerunner.run();; System.out.println(gamerunner.up());
		 * System.out.println(gamerunner.down()); System.out.println(gamerunner.left());
		 * System.out.println(gamerunner.right());
		 */
		
		PacMan game = new PacMan();
		GameRunner gamerunner = new GameRunner(game); // gamerunner.run();
		System.out.println(gamerunner.up());
		System.out.println(gamerunner.down());
		System.out.println(gamerunner.left());
		System.out.println(gamerunner.right());
	}

}
