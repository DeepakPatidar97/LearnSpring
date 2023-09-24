package com.springcore.App4GameAppComponentandCompontscan;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("SuperContraGameQualifier")
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
