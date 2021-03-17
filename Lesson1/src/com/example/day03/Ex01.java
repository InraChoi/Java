package com.example.day03;
import java.util.Scanner;
public class Ex01 {

	public static void main(String[] args) {
		// 사용자로부터 연산의 종류와 두 숫자를 입력받아
		// 연산하는 프로그램... 간단한 계산기 프로그램을 작성하시오.
		// 연산자 :  +, -, *, /
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println(" 첫번째 숫자를 입력하세요. ");
		int num1 = scan.nextInt();
		
		System.out.println(" 두번째 숫자를 입력하세요. ");
		int num2 = scan.nextInt();
		
		System.out.println("연산자를 입력하세요. +, -, *, / ");
		char oper = scan.next().charAt(0);

		double res = 0;
		
		switch (oper) {
		case '+' :
			res = num1 + num2;
			break;
		case '-' :
			res = num1 - num2;
			break;
		case '*' :
			res = num1 * num2;
			break;
		case '/' :
			res = num1 / num2;
			break;
		default :
			System.out.println("잘 못 되었습니다.");
			break;
		}
		
		 System.out.printf("%d %c %d = %.1f",num1,oper,num2,res);

	}

}
