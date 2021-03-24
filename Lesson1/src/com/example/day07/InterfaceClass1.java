package com.example.day07;

public class InterfaceClass1 implements Interface{
	
	@Override
	public void printInfo() {
		System.out.println(user + "님 반갑습니다.");
	}
	
	public void checkPass() {
		System.out.println("비밀번호는 "+ password +"입니다." );
	}
}
