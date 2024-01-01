package com.example.springproject.helloworld;

import java.util.Arrays;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class HelloWorldApp {
	public static void main(String[] args) {
		ApplicationContext app = new AnnotationConfigApplicationContext(HelloWorldConfig.class);
		
		System.out.println(app.getBean("name"));
		
		System.out.println(app.getBean("age"));
		
		System.out.println(app.getBean("person"));
		
		System.out.println(app.getBean("address"));
		
		System.out.println(app.getBean("student"));
		
		System.out.println(app.getBean("std"));
		
		Arrays.stream(app.getBeanDefinitionNames()).forEach(System.out::println); 	
		}
}
