package com.example.first;
import java.util.Scanner;	// import package

public class InputOutpu {

	public static void main(String[] args) {
		// Java Out
		
		/*
		 * System : 클래스, out : public static filed. accept data
		 *   
		 * System.out.println() : output string with newline 
		 * System.out.print() : output string without newline 
		 * System.out.printf() : output string with formatting
		 */
		/*
		 * System.out.print("Korea"); System.out.print("IT Academy");
		 * System.out.println("12345678901234567890"); System.out.printf("%05d\n", 123);
		 * //decimal (10진수) , 5자리, 앞자리는 0으로 채우기 System.out.printf("%010.3f\n", 1.23);
		 * //float number (실수), 10자리, 앞자리 0으로 채우기, 소수점 3자리까지 표현
		 */		
		// Java Input
		Scanner input = new Scanner(System.in);	
		
		// Scanner Class : 입력을 받기 위한 클래스
		// new : Scanner(), scanner 클래스의 constructor 생성자를 이용해서 객체를 생성하고
		// 생성된 객체를 input이라는 객체 참조변수를 만들겠다.
		// scanner 클래스의 생성자는 패러미터를 필요로하는데 여기에서는 
		// 시스템의 표준 입력장치를 이용하였다.
		
		// 사용자로부터 정수형 데이터를 입력받아 출력해보자.
		System.out.println("문자형 데이터를 입력해주세요.");
		String number = input.next();
		System.out.printf("입력한 정수는 %s 입니다.",number);
		
	}

}
