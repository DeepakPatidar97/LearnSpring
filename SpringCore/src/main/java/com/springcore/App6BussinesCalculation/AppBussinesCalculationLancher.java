package com.springcore.App6BussinesCalculation;

import java.util.Arrays;

//import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
//import org.springframework.stereotype.Component;

import com.springcore.App6BussinesCalculation.servicce.BussinessCalculationService;
import com.springcore.App6BussinesCalculation.servicce.DataService;

@Configuration
@ComponentScan
public class AppBussinesCalculationLancher {

	public static void main(String[] args) {

		ApplicationContext context = new AnnotationConfigApplicationContext(AppBussinesCalculationLancher.class);
		System.out.println(context.getBean(BussinessCalculationService.class).findMax());
				
		Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);

	}

}
