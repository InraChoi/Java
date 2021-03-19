package com.example.day04;

public class Student {
	// member properties
	private int studentID;
	private String studentName;	// access modifier 접근권한자
	private int grade;
	private String address;
	
	// default constructor 디폴트생성자 
	public Student() {
		this.studentName = "무명";
		this.address = "대한민국";
	}
	// constructor 계속 추가 가능 (다형성 = constructor overload)
	public Student(String name, String addr) {
		this.studentName = name;
		this.address = addr;
	}
	
	void showInfo() {
		System.out.println(studentName + ", "+ address);
	}
	
	public int getStudentID() {
		return studentID;
	}

	public void setStudentID(int studentID) {
		this.studentID = studentID;
	}

	public int getGrade() {
		return grade;
	}

	public void setGrade(int grade) {
		this.grade = grade;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getStudentName() {
		return studentName;
	}

	void setStudentName (String name) {
		this.studentName = name;
	}
	public void printThis() {
		System.out.println("value of this" + this);
	}
}
