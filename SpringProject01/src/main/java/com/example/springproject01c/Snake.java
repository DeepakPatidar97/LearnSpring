package com.example.springproject01c;

import org.springframework.stereotype.Component;

@Component
public class Snake implements GameConsole{
	
	public void up() {
		System.out.println("up");
	}
	
	public void down() {
		System.out.println("down");
	}
	
	public void left() {
		System.out.println("back");
	}
	
	public void rigth() {
		System.out.println("front");
	}
}
