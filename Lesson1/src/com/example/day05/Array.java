package com.example.day05;

public class Array {

	public static void main(String[] args) {
		int[] ary1 = new int[] {1,2,3,4,5};
		
//		System.out.println(ary1[4]);
		
		for(int i=0; i<ary1.length; i++) {
			System.out.println(ary1[i]);
		}
		
		for(int number :  ary1) {
			System.out.println(number );
		}
		
		
	}

}
