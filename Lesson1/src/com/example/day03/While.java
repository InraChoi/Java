package com.example.day03;

public class While {

	public static void main(String[] args) {
		int i=0, sum=0;
		do {
			i++;
			if(i % 2 == 0) continue; // 아래 코드를 무시하고 다시 반복 구문 시작함.
			System.out.println(i);
//			sum += i;
		}while(i<=10);
//		System.out.println(sum);
		
	}

}
