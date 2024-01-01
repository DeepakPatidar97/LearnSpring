package com.example.springprojectbussnesslogics;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@ComponentScan
@Configuration
public class SpringCalculaterApp {

	public static void main(String[] args) {
		ApplicationContext app = new AnnotationConfigApplicationContext(SpringCalculaterApp.class);
		app.getBean(BusinessCalculationServices.class).findMax();
	}

}
