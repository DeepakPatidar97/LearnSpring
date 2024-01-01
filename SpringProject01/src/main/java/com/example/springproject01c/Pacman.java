package com.example.springproject01c;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class Pacman implements GameConsole{
	
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
		System.out.println("run");
	}
}
