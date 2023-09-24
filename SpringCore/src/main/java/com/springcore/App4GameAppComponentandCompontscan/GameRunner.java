package com.springcore.App4GameAppComponentandCompontscan;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;


@Component
public class GameRunner extends MarioGame{
	private GameConsole game;
	
	GameRunner(@Qualifier("SuperContraGameQualifier") GameConsole game){
			this.game = game;
		}
		
		
		public void run() {
			System.out.println("ruuning game "+ game);
		}
	
}
