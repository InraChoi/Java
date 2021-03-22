package com.example.day05;

public class Company {
	private static Company instance = new Company();
	
	private Company(){
		// none peration
	}
	
	public static Company getInstance() {
		if(instance == null) {
			instance = new Company();
		}
		
		return instance;
		
	}
	
}
