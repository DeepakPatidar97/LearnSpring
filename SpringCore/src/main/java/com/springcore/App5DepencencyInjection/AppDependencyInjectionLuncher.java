package com.springcore.App5DepencencyInjection;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Configuration
@ComponentScan
public class AppDependencyInjectionLuncher {

	public static void main(String[] args) {

		ApplicationContext context = new AnnotationConfigApplicationContext(AppDependencyInjectionLuncher.class);
		Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
		System.out.println(context.getBean(BussnessClass.class));
	}
}

@Component
class BussnessClass {

	// Using Fields injection

	// @Autowired
	Dept1 dept1;

	// @Autowired
	Dept2 dept2;

	// using constructer injection

	//@Autowired
	/*
	 * BussnessClass(Dept1 dept1, Dept2 dept2) {
	 * System.out.println("Constructer Dependency - [dept1=" + dept1 + ", dept2=" +
	 * dept2 + "]"); this.dept1 = dept1; this.dept2 = dept2; }
	 */

	@Override
	public String toString() {
		return "BussnessClass [dept1=" + dept1 + ", dept2=" + dept2 + "]";
	}

	// using setter injection

	@Autowired
	public void setDept1(Dept1 dept1) {
		System.out.println("setter injection "+dept1);
		this.dept1 = dept1;
	}

	@Autowired
	public void setDept2(Dept2 dept2) {
		System.out.println("setter injection "+dept2);
		this.dept2 = dept2;
	}

}

@Component
class Dept1 {

}

@Component
class Dept2 {

}
