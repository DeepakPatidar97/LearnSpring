package com.springcore.App6BussinesCalculation.servicce;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
public class MongoDbDataService implements DataService {

	@Override
	public int[] retrivedata() {
		
		return new int[] {11,22,33,44,55};
	}

}
