package com.springcore.App3GameSpringBean;

import org.springframework.stereotype.Repository;

@Repository
public interface GameConsole {
	public String up();
	
	public String down();
	
	public String left();
	
	public String right();
}
