package com.example.day08;

public class ExceptionHandling {
	// throws 상위 프로그램에게 오류결과를 넘김.
	public static void main (String[] args) throws ArithmeticException{
		int number1 = 10;
		int number2 = 0;
		double result = 0;
		result = number1/number2;
		
		// ArithmeticException --> 산술연산 오류
		// IndexOutofBoundsException --> 변수 오류
		// 데이터베이스 처리, 파일 처리, 통신처리 오류
		
		/*
		try {
			result = number1/number2;
		}catch(ArithmeticException e) {
			e.printStackTrace();
			System.out.println("0으로 나눌 수 없어요.");
		}finally {
			//pass
			// 예외상황과 상관 없이 반드시 실행해야 할 코드..
		}
		*/
		
		System.out.println(result);
		System.out.println("프로그램을 종료합니다.");
	}	

}
