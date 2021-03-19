package com.example.day04;

public class Bus {
	int busName;
	int passengerCount;
	int money;
	public Bus(int busName) {
		super();
		this.busName = busName;
	}
	
	public void take(int money) {
		this.money += money;
		passengerCount++;
	}
	
	public void shoInfo() {
		System.out.println("버스 "+ busName + "번의 승객은" + passengerCount + "명이고, 수입은 " + money + "입니다.");
	}
}
