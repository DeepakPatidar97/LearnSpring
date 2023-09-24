package com.springcore.App3GameSpringBean;

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
