package com.example.day04;

public class StudentTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student student1 = new Student();
		Student student2 = new Student("최인라","청주시");
		
//		student1.setAddress("청주시");
//		student1.setStudentName("최인라");
//		
//		student2.setStudentName("박문수");
//		student2.setAddress("대전시");
		
//		System.out.println(student1.getStudentName());
		student1.showInfo();
		student2.showInfo();
		System.out.println("in main : " +student1);
		student1.printThis();
		System.out.println("in main : " +student2);
		student2.printThis();
		System.out.println( test(5) );
		
	}
	
	public static int test(int a) {
		return a * 2 ;
	}

}
