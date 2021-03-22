package com.example.day05;

public class Student {
	private static int serialNum = 1000;
	
	public int studentID;
	public String studentName;
	public int grade;
	public String address;
	
	
	public Student() {
		serialNum++;
		this.studentID = serialNum;
	}
	
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	
	public static int getSerialNum() {
		return serialNum;
	}

	public static void setSerialNum(int serialNum) {
		Student.serialNum = serialNum;
	}
}
