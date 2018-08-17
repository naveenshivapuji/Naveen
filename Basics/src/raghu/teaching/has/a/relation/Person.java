package raghu.teaching.has.a.relation;

import java.util.Scanner;

public class Person  //composed class
{

	String name;
	Date DateOfBirth;
	
	Person ( String name)
	{
		this.name = name;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Date of Birth");
		int d= sc.nextInt();
		int m = sc.nextInt();
		int y =sc.nextInt();
		
		this.DateOfBirth = new Date(d,m,y);
		
	}
	
	void personInfo()
	{
		System.out.println("Name " +name);
		System.out.println("DOB  " + DateOfBirth.getDate());
	}
	
}
