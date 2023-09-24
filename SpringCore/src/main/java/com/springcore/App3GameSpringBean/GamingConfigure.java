package com.springcore.App3GameSpringBean;

import org.springframework.context.annotation.Bean;


public class GamingConfigure extends MarioGame{
	
	@Bean
	public GameConsole game() {
		return new MarioGame();
	}
	
	@Bean
	public GameRunner GameRunner(GameConsole game) {
		return new GameRunner(game);
	}
	
	
}
