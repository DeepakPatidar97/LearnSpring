package com.example.springproject01c;

import org.springframework.stereotype.Component;

@Component
public class SuperMario implements GameConsole{
	
	public void up() {
		System.out.println("jump");
	}
	
	public void down() {
		System.out.println("sit");
	}
	
	public void left() {
		System.out.println("back");
	}
	
	public void rigth() {
		System.out.println("Fire");
	}
}
