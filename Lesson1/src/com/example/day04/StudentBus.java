package com.example.day04;

public class StudentBus {
	// property
	public String studentName;
	public int grade;
	public int money;
	
	// methods
	// constructor
	public StudentBus(String studentName, int money) {
		super();	//상위클래스의 생성자를 돌려라 (default로 실행되기때문에 생략가능)
		this.studentName = studentName;
		this.money = money;
	}
	
	public void takeBus(Bus bus) {
		bus.take(1000);
		this.money -= 1000;
	}
	
	public void showInfo() {
		System.out.println(this.studentName + "님의 남은 돈은 " + this.money + "원 입니다.");
	}
	
}
