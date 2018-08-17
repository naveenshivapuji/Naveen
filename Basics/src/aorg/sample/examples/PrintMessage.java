package aorg.sample.examples;

import java.util.Scanner;

public class PrintMessage {
	
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		System.out.println("Enter your age");
		int age = s.nextInt();
		
		s.nextLine();  //Before nextLine() call if there is any other method call, except nextLine() use dummy nextLine() call
		
		System.out.println("Enter your Name");
		String name = s.nextLine();
		System.out.println(age + " " + name);
		
	}
	
	

}
