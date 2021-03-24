package com.example.day07;

public interface Interface {
	public String user = "최인라";
	public String password = "12345";
	
	default public void printInfo() {
		System.out.println("interface");
	}
	static public void statcTest() {
		System.out.println("static");
		
	}
	
}
