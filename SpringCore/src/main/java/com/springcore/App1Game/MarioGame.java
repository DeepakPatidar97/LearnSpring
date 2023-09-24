package com.springcore.App1Game;

public class MarioGame implements GameConsole {
	
	public String up() {
		return "jump";
	}
	
	public String down() {
		return "inside hole";
	}
	
	public String left() {
		return "back";
	}
	
	public String right() {
		return "shoot";
	}
}
