package com.example.day03;

public class SwitchCase {

	public static void main(String[] args) {
		// switch case 구문
		
		
//		switch (expression) {
//			case 1 : 
//			case 2 :
//			case 3 :
//			default :
//		}
	
		int score = 87;
		char grade = ' ';
		
		switch ((int) (score/10)) {
		case 10 :
		case 9 :
			grade = 'A';
			break;
		case 8 :
			grade = 'B';
			break;
		case 7 :
			grade = 'C';
			break;
		case 6 :
			grade = 'D';
			break;
		default :
			grade = 'F';
			break;
	}
		System.out.printf("성적 등급 : %c", grade);
		
	}

}
