package raghu.teaching.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Scanner;

public class EmployeeRunner {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		ArrayList al = new ArrayList();

		while (true) {
			System.out.println("Enter the Employee information Emp ID, Emp Name and Emp Salary :  ");
			System.out.println("Employee ID : ");
			int id = sc.nextInt();
			System.out.println("Employee Name :");
			String str = sc.next();
			System.out.println("Employee Salary : ");
			double sal = sc.nextDouble();
			al.add(new Employee(id, str, sal));
			System.out.println("Do you want to add any more records (Y OR N) : ");
			String val = sc.next();
			if (val.equalsIgnoreCase("n"))
				break;
		}

		System.out.println("---------------:Employee Information:-----------");
		for (Object emp : al) {

			System.out.println(emp);
		}

		System.out.println("------:Employee Information Reverse Order:-------");
		Collections.reverse(al);
		for (Object emp : al) {

			System.out.println(emp);
		}

		System.out.println("----------:Compare Employee Information:--------------");
		class ComInfo implements Comparator {
			public int compare(Object o1, Object o2) {
				Employee e1 = (Employee) o1;
				Employee e2 = (Employee) o1;
				if (e1.id > e2.id)
					return 1;
				else
					return -1;
			}
		}
		Object max = Collections.max(al, new ComInfo());
		System.out.println("------:ID MAX RECORD:-----------");
		System.out.println(max);

		Object min = Collections.min(al, new ComInfo());
		System.out.println("------:ID min RECORD:-----------");
		System.out.println(min);

		System.out.println("---------: Sort By Name :----------");
		Comparator namecomp = new Comparator() {
			public int compare(Object o1, Object o2) {
				Employee e1 = (Employee) o1;
				Employee e2 = (Employee) o1;
				if (e1.name.compareTo(e2.name) > 1)
					return 1;
				else
					return -1;
			}
		};
		Collections.sort(al, namecomp);
		for (Object emp : al) {
			System.out.println(emp);
		}

		System.out.println("---------:Sort By Employee ID:-------------");
		Comparator idcomp = new Comparator() {

			public int compare(Object o1, Object o2) {
				Employee e1 = (Employee) o1;
				Employee e2 = (Employee) o2;
				return e1.id - e2.id;
			}
		};
		Collections.sort(al, idcomp);
		for (Object emp : al) {
			System.out.println(emp);
		}

		Collections.sort(al, new ComInfo());
		for (Object emp : al) {
			System.out.println(emp);
		}

	}

}
