package com.example.springprojectbussnesslogics;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Component
public class BusinessCalculationServices {
	@Autowired
	DataService dataService;
	
	public int findMax() {
		return Arrays.stream(dataService.retriveData()).max().orElse(0);
	}
}
