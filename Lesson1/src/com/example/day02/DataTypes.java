package com.example.day02;

public class DataTypes {

	public static void main(String[] args) {
		// 단계 1.
		//			정수형 문자형  실수형   논리형
		// 1byte 	byte	 -	 	-		boolean
		// 2byte	short	char    -		   -
		// 4byte	int		 -	   float	   -
		// 8byte 	long	 -	   double     -
		
		System.out.println("Integer MIN : " + Integer.MIN_VALUE);
		System.out.println("Integer MAX : " + (Integer.MAX_VALUE + 1)); 
		
		System.out.println("byte MIN : " + Byte.MIN_VALUE);
		System.out.println("byte MAx : " + Byte.MAX_VALUE);
		
		System.out.println("short MIN : " + Short.MIN_VALUE);
		System.out.println("short MAx : " + Short.MAX_VALUE);
		
		System.out.println("Float MIN : " + Float.MIN_VALUE);
		System.out.println("Float MAx : " + Float.MAX_VALUE);
		
		System.out.println("Double MIN : " + Double.MIN_VALUE);
		System.out.println("Double MAx : " + Double.MAX_VALUE);
		
		// 상수형 데이터 선언
		int num1 = 1234567890;
		long num2 = 1234567890L;
		double num3 = 3.141592;
		float num4 = 3.141592F;
		
		// 논리형(부울형 boolean) 데이터
		boolean isMarried = true;
		System.out.println(isMarried);
		
		// 상수선언과 사용 - 값 변환 불가
		final double PI = 3.14;
		
		// 3단계 타입변환 : 묵식적 형변환  vs 명시적 형변환
		Float result;
		Float numF = 5.0F;
		int numT = 3;
		result = numF / numT;	
		
		
		System.out.println(result);
		
		
	}

}
