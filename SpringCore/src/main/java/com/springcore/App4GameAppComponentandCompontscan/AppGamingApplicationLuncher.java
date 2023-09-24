package com.springcore.App4GameAppComponentandCompontscan;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
public class AppGamingApplicationLuncher{

	public static void main(String[] args) {
		
		

		ApplicationContext context = new AnnotationConfigApplicationContext(AppGamingApplicationLuncher.class);
		//PacMan game = context.getBean(PacMan.class);
		//SuperContraGame game = context.getBean(SuperContraGame.class);
		context.getBean(GameRunner.class).run();
		
		GameConsole game =context.getBean(GameRunner.class);
		System.out.println(game.down());
		System.out.println(game.up());
		System.out.println(game.left());
		System.out.println(game.right());
	}
}


