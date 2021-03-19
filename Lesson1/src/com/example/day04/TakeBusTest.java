package com.example.day04;

public class TakeBusTest {

	public static void main(String[] args) {
		StudentBus choi = new StudentBus("최인라", 10000);
		StudentBus kim = new StudentBus("김길동",5000);
		
		Bus bus100 = new Bus(100);
		
		choi.showInfo();
		bus100.shoInfo();
		choi.takeBus(bus100);
		choi.showInfo();
		kim.takeBus(bus100);
		
		bus100.shoInfo();
		
		
		
	}

}
