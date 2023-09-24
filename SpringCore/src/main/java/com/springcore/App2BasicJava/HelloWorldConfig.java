package com.springcore.App2BasicJava;

import java.util.Arrays;
import java.util.jar.Attributes.Name;

import org.springframework.context.annotation.Bean;

public class HelloWorldConfig {
	
	@Bean
	public String name() {
		return "Deepak";
	}
	
	@Bean
	public int age() {
		return 12;
	}
	
	@Bean
	public Person person() {
		return new Person("Ram", 18);
	}
	
	@Bean
	public Person person2methodcall() {
		return new Person(name(), age());
	}
	
	@Bean(name ="address2" )
	public Address address() {
		return new Address("UP", "Noida");
	}
	
	@Bean
	public Person address2perameters(String name, int age, Address address2) {
		return new Person(name, age, address2);
	}
	
	
}
