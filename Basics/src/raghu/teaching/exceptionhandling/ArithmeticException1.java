package raghu.teaching.exceptionhandling;

import java.util.Scanner;

public class ArithmeticException1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Main method started");
		System.out.println("Enter the first value");
		int a = sc.nextInt();
		System.out.println("Enter the second value ");
		int b = sc.nextInt();
		try {
			
			int q = a/b;
			System.out.println("The quotent is " + q);
		}
		catch(ArithmeticException ae)
		{
			System.out.println("Second value can't be zero");
		}
		System.out.println("Thank you");
		System.out.println("Main Method End");
		
	}

}
