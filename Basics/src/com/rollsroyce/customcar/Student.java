package com.rollsroyce.customcar;

public class Student {

	int id;
	String name;
	
	Student(int id, String name) {
		this.id = id;
		this.name = name;
		
	}
	
	public String toString() {
		return this.id + " " + name;
	}

	public static void main(String[] args) {
		
		Student s = new Student(1, "Alpha");
		System.out.println(s);
		Student s1 = new Student(1, "Beta");
		System.out.println(s1);
		
	}
}
