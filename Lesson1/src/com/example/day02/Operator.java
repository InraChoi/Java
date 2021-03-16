package com.example.day02;
import java.util.Scanner;	// import package
public class Operator {

	public static void main(String[] args) {
//		산술 연산자(arithmetic operator) : +, -, *, /, %
//		대입 연산자(assignment operator) : =, 복합대입연산자
//		증감 연산자(increment and decrement operators) : ++x, x++, --x, x--
//		비교 연산자(comparison operator) : ==, !=, >, >=, <, <=
//		논리 연산자(logical operator) : &&, ||, !
//		비트 연산자(bitwise operator) : &, |, ^, ~, <<, >>, >>>
//		삼항 연산자(ternary operator) : 조건식?반환값1:반환값2
//		instanceof 연산자 : 인스턴스이름 instanceof 클래스또는인터페이스이름
		
		// 증감 연산자의 위치에 따른 구분
//		int value = 10;
//		int result = value++;
//		System.out.println(result);
//		System.out.println(value);
		
		// 비트 연산자
		int a = 13;
		int b = 5;
		System.out.println(a & b );	// 비트연산 &
		System.out.println(a | b );	// 비트연산 |
		System.out.println(a ^ b );	// 비트연산 Xor(배타적 or) 다른면 1 같으면 0
		
		// 삼항연산자
		// 결과변수 = 조건식 ? 참일때 값 : 거짓일때 값
		int result = 10 < 5 ? 100 : 0;
		System.out.println(result);
		
		Scanner ss = new Scanner(System.in);
		System.out.println(ss instanceof Scanner);
		
	}

}
