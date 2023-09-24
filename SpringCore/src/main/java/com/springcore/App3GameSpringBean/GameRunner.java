package com.springcore.App3GameSpringBean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;



public class GameRunner extends MarioGame{
	private GameConsole game;
	
	GameRunner(GameConsole game){
			this.game = game;
		}
		
		
		public void run() {
			System.out.println("ruuning game "+ game);
		}
	
}
