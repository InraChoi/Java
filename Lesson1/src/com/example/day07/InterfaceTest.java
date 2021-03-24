package com.example.day07;

public class InterfaceTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InterfaceClass1 ic1 = new InterfaceClass1();
		Interface i = ic1;
		System.out.println(i.user);
		System.out.println(ic1.user);
		ic1.checkPass();
		
		Interface.statcTest();
		
		if(i instanceof InterfaceClass1) {
			InterfaceClass1 ic2 = (InterfaceClass1) i;
			ic2.checkPass();
		}
	}

}
