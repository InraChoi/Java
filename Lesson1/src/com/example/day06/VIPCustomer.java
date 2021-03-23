package com.example.day06;

public class VIPCustomer extends Customer {
	private int agentID;
	double saleRatio;
	
	public VIPCustomer() {
		super();
		customerGrade = "VIP";
		bonusRatio = 0.05;
		saleRatio = 0.1;
		System.out.println("VIPCustomer 생성자가 호출되었습니다.");
	}
	
	public VIPCustomer(int customerID, String customerName, int agentID) {
		super(customerID, customerName);
		customerGrade = "VIP";
		bonusRatio = 0.05;
		saleRatio = 0.1;
		System.out.println("VIPCustomer 생성자가 호출되었습니다.");
	}
	public int getAgentID() {
		return agentID;
	}
	
	@Override  // Annotation - 상위클래스에서 상속받은 메소드를 수정하겠다.
	public int calcPrice(int price) {
		bonusPoint += price * bonusRatio;
		return price - (int)(price * saleRatio);
	}
	public String showVIPInfo() {
		return super.showCustomerInfo()+"담당 상담원 아이디는" + agentID + "입니다.";
	}
}
