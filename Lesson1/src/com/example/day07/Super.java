package com.example.day07;

public class Super extends Player {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("엄청 빨리 달립니다.");
	}

	@Override
	public void jump() {
		// TODO Auto-generated method stub	
		System.out.println("아주 높이 jump 합니다.");
		System.out.println("아주 높이 jump 합니다.");
		System.out.println("아주 높이 jump 합니다.");

	}

	@Override
	public void turn() {
		// TODO Auto-generated method stub
		System.out.println("한 바퀴 돕니다.");
	}

}
