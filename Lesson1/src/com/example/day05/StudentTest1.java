package com.example.day05;

public class StudentTest1 {

	public static void main(String[] args) {
		System.out.println(Student.getSerialNum());
		
		// 인스턴스화 한 후
		Student studentLee = new Student();
		studentLee.setStudentName("이지원");
		System.out.println(studentLee.studentID);
		
		Student studentSon = new Student();
		studentSon.setStudentName("손수경");
		System.out.println(studentSon.studentID);
		
		
	}

}
