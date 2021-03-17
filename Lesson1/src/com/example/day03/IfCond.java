package com.example.day03;

/*
if statement의 sysntax
if(조건식) {
	// 조건이 참인 경우 실행할 code block
}
*/
public class IfCond {

	public static void main(String[] args) {
		int number = 10;
		if(number > 0) {
			System.out.println("양의 정수입니다.");
		}
		else if(number == 0){
			System.out.println("숫자는 0 입니다.");
		}
		else {
			System.out.println("음의 정수입니다.");
		}
		
	}

}
