package com.college.student;

public class Student {
	
	int rollNo;
	String name;
	static String collegeName = "IIT";
	
	
	Student (int rollNo,String Name)
	{
		this.rollNo = rollNo;
		this.name = name;
		
	}
	public static void main(String[] args) {
		
		System.out.println(Student.collegeName);

			Student s1 = new Student(1, "Alpha");
			Student s2 = new Student(2,  "Beta");
			Student s3 = new Student(3, "Charlie");
			
			s1.collegeName = "IIM";
			System.out.println(s1);
			
	}

}
