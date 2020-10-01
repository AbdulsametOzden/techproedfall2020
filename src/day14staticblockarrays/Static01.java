package day14staticblockarrays;

import java.util.Scanner;

public class Static01 {
	
	/*
	 Type a program to create unique student ids
	*/
	
	String studentName;
	int year = 2020;
	static int counter = 1000;
	String studentId;
	
	public Static01() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your name");
		this.studentName = scan.next();
		setId();
	}
	

	public static void main(String[] args) {
		
		Static01 student1 = new Static01();
		System.out.println(student1.studentName + student1.studentId);
		
		Static01 student2 = new Static01();
		System.out.println(student2.studentName + student2.studentId);
		
		Static01 student3 = new Static01();
		System.out.println(student3.studentName + student3.studentId);
		
	}
	
	public void setId() {
		counter++;
		this.studentId = year + "" + counter;
	}

}
