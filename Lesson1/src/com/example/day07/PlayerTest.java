package com.example.day07;

public class PlayerTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Player p1 = new Beginner(); 
		Player p2 = new Advanced();
		Player p3 = new Super();
		
		System.out.println("******************* 초보자 레벨입니다. **********************");
		p1.go();
		System.out.println("******************* 중급자 레벨입니다. **********************");
		p2.go();
		System.out.println("******************* 고급자 레벨입니다. **********************");
		p3.go();
		
		
	}

}
