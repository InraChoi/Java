package com.example.day07;

// abstract 상위 클래스의 abstract 메소드를 오버라이드 하지않을 경우 abstract 클래스화 시켜야 함.
public abstract class Notebook extends Computer{
	@Override
	public void typing() {	
		System.out.println("Notebook typing()");
	}
	
}
