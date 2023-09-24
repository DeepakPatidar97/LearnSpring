package com.springcore.App3GameSpringBean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AppGamingBasicJava {

	public static void main(String[] args) {

		ApplicationContext context = new AnnotationConfigApplicationContext(GamingConfigure.class);
		//PacMan game = context.getBean(PacMan.class);
		//SuperContraGame game = context.getBean(SuperContraGame.class);
		context.getBean(GameRunner.class).run();
		
		 MarioGame game = (MarioGame) context.getBean(GameRunner.class);
		System.out.println(game.down());
		System.out.println(game.up());
		System.out.println(game.left());
		System.out.println(game.right());
	}

}
