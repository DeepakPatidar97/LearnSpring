package com.springcore.App2BasicJava;

import java.util.Arrays;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

public class HelloWorldSpringBoot {

	public static void main(String[] args) {
		
		ApplicationContext context = new  AnnotationConfigApplicationContext(HelloWorldConfig.class);
		System.out.println(context.getBean("name"));
		System.out.println(context.getBean("age"));
		System.out.println(context.getBean("person"));
		System.out.println(context.getBean("person2methodcall"));
		System.out.println(context.getBean("address2"));
		System.out.println(context.getBean("address2perameters"));
		//System.out.println(context.getBean(Person.class));
		
		
		//All beans 
		Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
		((AbstractApplicationContext) context).close();
	}
}
