package com.springcore.App1Game;

//Demo 
public class SuperContraGame implements GameConsole{
	
	public String up() {
		return "jump";
	}
	
	public String down() {
		return "sheet";
	}
	
	public String left() {
		return "back";
	}
	
	public String right() {
		return "run";
	}
	
}
