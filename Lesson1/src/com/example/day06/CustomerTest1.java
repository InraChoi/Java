package com.example.day06;

public class CustomerTest1 {

	public static void main(String[] args) {
		Customer customerLee = new Customer();
		customerLee.setCustomerName("이순신");
		customerLee.setCustomerID(10010);
		customerLee.bonusPoint = 1000;
		System.out.println(customerLee.calcPrice(10000));
		System.out.println(customerLee.showCustomerInfo());
		
//		VIPCustomer vc = new VIPCustomer();
		Customer customerKim = new VIPCustomer();
		customerKim.setCustomerName("김유신");
		customerKim.setCustomerID(10020);
		customerKim.bonusPoint = 10000;
		System.out.println(customerKim.calcPrice(10000));
		System.out.println(customerKim.showCustomerInfo());
		
		
	}
	
	

}
