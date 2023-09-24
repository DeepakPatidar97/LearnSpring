package com.springcore.App3GameSpringBean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
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
