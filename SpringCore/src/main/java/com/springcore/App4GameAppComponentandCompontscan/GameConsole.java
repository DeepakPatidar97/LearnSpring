package com.springcore.App4GameAppComponentandCompontscan;

import org.springframework.stereotype.Component;

@Component
public interface GameConsole {
	public String up();
	
	public String down();
	
	public String left();
	
	public String right();
}
