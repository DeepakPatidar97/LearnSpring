package com.example.springproject.helloworld;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

record Person(String name, int age) {};
record Address(String state, String Distric, String ciy, String pin) {};
record Student(String name, int age, Address address) {};

@Configuration
public class HelloWorldConfig {
	
	@Bean
	public String name() {
		return "Deepak Priya Patidar";
	}
	
	@Bean
	public int age() {
		return 20;
	}
	
	@Bean
	public Person person() {
		return new Person("Raju ", 18);
	}
	
	@Bean
	public Address address() {
		return new Address("Madhya Pradesh", "Khargone", "Mahetwada", "451224");
	}
	
	@Bean
	public Student student() {
		return new Student(name(), age(), address());
	}
	
	@Bean(name="std")
	public Student student4() {
		return new Student(name(), age(), new Address("Utter Pradesh", "Noida", "Sectore 71", "201305"));
	}
		
	
}
