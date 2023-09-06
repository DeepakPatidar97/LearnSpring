package com.springcore;

import java.util.List;
import java.util.Properties;
import java.util.Set;

public class Address {
	
	private List<Integer> houseNumber;
	private Set<String> city;
	private Properties state;
	public Address(List<Integer> houseNumber, Set<String> city, Properties state) {
		super();
		this.houseNumber = houseNumber;
		this.city = city;
		this.state = state;
	}
	
	@Override
	public String toString() {
		return "Address [houseNumber=" + houseNumber + ", city=" + city + ", state=" + state + "]";
	}
	
	
	
	

}
