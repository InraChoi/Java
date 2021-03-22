package com.example.day05;

public class CompanyTest {

	public static void main(String[] args) {
		Company samsung = Company.getInstance();
		Company lg = Company.getInstance();
		
		System.out.println(samsung);
		System.out.println(lg);
		
	}

}
