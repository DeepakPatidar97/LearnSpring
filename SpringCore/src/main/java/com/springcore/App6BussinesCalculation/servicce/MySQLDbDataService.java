package com.springcore.App6BussinesCalculation.servicce;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class MySQLDbDataService implements DataService{

	@Override
	public int[] retrivedata() {
		return new int[] {1,2,3,4,5};
	}

}
