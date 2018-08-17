package raghu.teaching.collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class StudentRunner {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		ArrayList al = new ArrayList();
		
		while(true) {
			
			System.out.println("Enter Student information :");
			int id = sc.nextInt();
			String name = sc.next();
			double per = sc.nextDouble();
			al.add(new Student(id, name, per));
			System.out.println("Any more records");
			String val = sc.next();
			if (val.equalsIgnoreCase("n"))
				break;
		}
		
		for (Object std : al) {
			System.out.println(std);
		}
		
		Collections.reverse(al);
		}

	}


