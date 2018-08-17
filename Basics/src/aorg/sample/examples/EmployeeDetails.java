package aorg.sample.examples;

import java.util.Scanner;

public class EmployeeDetails {
	
	String name;
	long mobileNo;
	String fatherName;
	String motherName;
	int age;
	String pan;
	String adharNo;
	String address;
	int pinCode;
	String maritialStatus;
	String accountNumber;
	
	public String toString() {
		return "EmployeeDetails [name=" + name + ", mobileNo=" + mobileNo + ", fatherName=" + fatherName
				+ ", motherName=" + motherName + ", age=" + age + ", pan=" + pan + ", adharNo=" + adharNo + ", address="
				+ address + ", pinCode=" + pinCode + ", maritialStatus=" + maritialStatus + "]";
	}

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		
		EmployeeDetails ed = new EmployeeDetails();
		
		System.out.println("Enter your Name : ");
		ed.name = s.nextLine();
		System.out.println("Enter Mobile Number : ");
		ed.mobileNo = s.nextLong();
		s.nextLine();
		System.out.println("Enter Fathers Name");
		ed.fatherName = s.nextLine();
		System.out.println("Enter Mother Name : ");
		ed.motherName = s.nextLine();
		System.out.println("Enter your Age :");
		ed.age = s.nextInt();
		System.out.println("Enter your PAN Number :");
		ed.pan = s.next();
		s.nextLine();
		System.out.println("Enter your Adhar Number : ");
		ed.adharNo = s.nextLine();
		System.out.println("Enter home Address : ");
		ed.address = s.nextLine();
		System.out.println("Enter PIN Code : ");
		ed.pinCode = s.nextInt();
		System.out.println("Enter Marital Status : ");
		ed.maritialStatus = s.next();
		s.nextLine();
		System.out.println("Enter account Number : ");
		ed.accountNumber = s.nextLine();
		s.close();
		
	}


}
