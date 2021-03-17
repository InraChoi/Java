package com.example.day03;

public class EnhancedFor {

	public static void main(String[] args) {
		// 배열
		int[] numbers = {3, 9, 5, -10, 10};
		
//		for(int i=0; i<numbers.length; i++) {
//			System.out.println(numbers[i]);
//		}
		
		// for each Loop
		for(int i : numbers) {
			System.out.println(i);
		}
		
	}

}
