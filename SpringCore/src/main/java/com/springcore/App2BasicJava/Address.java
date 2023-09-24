package com.springcore.App2BasicJava;

public class Address {
	private String state;
	private String city;
	
	public Address(String state, String city){	
		this.state = state;
		this.city = city;
	}

	public Address() {
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "[ state : "+state+", city :"+ city+" ]";
	}
	
}
