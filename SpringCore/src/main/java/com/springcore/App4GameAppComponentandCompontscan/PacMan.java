package com.springcore.App4GameAppComponentandCompontscan;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class PacMan implements GameConsole{

	
	public String up() {
		// TODO Auto-generated method stub
		return "up";
	}

	
	public String down() {
		// TODO Auto-generated method stub
		return "down";
	}

	
	public String left() {
		// TODO Auto-generated method stub
		return "left";
	}

	public String right() {
		// TODO Auto-generated method stub
		return "right";
	}

}
