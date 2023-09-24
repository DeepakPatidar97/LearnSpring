package com.springcore.App6BussinesCalculation.servicce;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BussinessCalculationService {

	  private DataService dataService;
	  
	  @Autowired BussinessCalculationService(DataService dataService) {
	  this.dataService = dataService; }
	  
	  public int findMax() { return
	  Arrays.stream(dataService.retrivedata()).max().orElse(0); }
	  
	 
}
