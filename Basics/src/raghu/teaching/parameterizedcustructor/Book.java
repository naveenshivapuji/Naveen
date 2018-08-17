package raghu.teaching.parameterizedcustructor;

import java.util.Scanner;

public class Book {

	String bName;
	double bPrice;
	
	//Constructor which accepts the inputs 
	Book()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Book Name ");
		bName = sc.nextLine();
		System.out.println("Enter the Book Price");
		bPrice = sc.nextDouble();
		
	}
	
	//Method which calls displays the value accepted by the constructor
	void BookInfo()
	{
		System.out.println("book Name  " + bName);
		System.out.println("Book Price " + bPrice);
	}
	
}

