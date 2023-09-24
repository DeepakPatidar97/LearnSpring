package com.springcore.App4GameAppComponentandCompontscan;

import org.springframework.stereotype.Component;


@Component
public class GameRunner extends MarioGame{
	private GameConsole game;
	
	GameRunner(GameConsole game){
			this.game = game;
		}
		
		
		public void run() {
			System.out.println("ruuning game "+ game);
		}
	
}
