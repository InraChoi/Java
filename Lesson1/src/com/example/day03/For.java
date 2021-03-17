package com.example.day03;

public class For {
	
	public static void main(String[] args) {
		// for (초기값; 조건; 제어변수의 증감식)
//		int i, evensum = 0, oddsum = 0;
//		for(i = 1; i <= 100; i++) {
//			if(i%2 == 0) evensum += i;
//			else oddsum += i;
//		}
//		System.out.printf("짝수합 :  %d, 홀수합 : %d", evensum,oddsum);
		
		// Nested For Loop
		for (int i = 2; i <= 10; i=i+3) {
			for	(int j = 1; j<10; j++) {
				System.out.printf("%d * %d = %d \t %d * %d = %d \t %d * %d = %d \n", i, j, i*j, i+1, j, (i+1)*j,i+2, j, (i+2)*j);
			}
			System.out.println();
		}
	}

}
