package raghu.teaching;

import java.util.Scanner;

public class SumArray {

	public static void main(String[] args) {

		System.out.println("Main Method Started");
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the length of array");
		int n = sc.nextInt();
		double ele[] = new double[n];
		System.out.println("Enter " + n + "values");
		for (int i = 0; i < n; i++) {
			ele[i] = sc.nextDouble();
		}

		double sum = 0;
		for (int i = 0; i < ele.length; i++) {
			sum += ele[i];
		}

		System.out.println("Total is " + sum);
		System.out.println(" Avarage of the numbers is  " + sum / ele.length);

	}

}
