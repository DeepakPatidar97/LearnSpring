package com.example.springprojectbussnesslogics;

import org.springframework.stereotype.Component;

@Component
public class MongoDbDataServices implements DataService {

	public int[] retriveData() {
		return new int [] {1,2,3,4,5};
	}

}
