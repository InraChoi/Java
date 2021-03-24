package com.example.day07;

public class ComputerTest {

	public static void main(String[] args) {
//		Computer c1 = new Computer();	// 추상클래스와 인스터페이스에서든 직접 클래스 생성 할 수 없다.
		Computer c2 = new DeskTop();	// 인스턴스화 -> 객체 참조변수
//		Computer c3 = new Notebook();
		Computer c4 = new MyNotebook();	// 인스턴스화 -> 객체 참조변수
	}

}
