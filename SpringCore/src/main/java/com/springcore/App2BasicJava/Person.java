package com.springcore.App2BasicJava;

public class Person {
	private String name;
	private int age;
	private Address address;
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
		
	}
	public Person(String name, int age, Address address) {
		this.name = name;
		this.age = age;
		this.address = address;
	}
	
	public Person() {
		
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "[ name : "+name+", age :"+ age+",  Address : "+address+ "]";
	}
}
