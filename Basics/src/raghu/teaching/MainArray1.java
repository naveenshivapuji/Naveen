package raghu.teaching;

import java.util.Scanner;

public class MainArray1 {

	public static void main(String[] args) {

		System.out.println("Main method started");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the array : ");
		int n = sc.nextInt();

		int ar[] = new int[n];

		System.out.println("Enter " + n + " array elements. ");

		for (int i = 0; i < ar.length; i++) {
			ar[i] = sc.nextInt();
		}
		int count[] = new int[2];
		for (int i = 0; i < ar.length; i++) {
			count[ar[i] % 2]++;
		}
		System.out.println("Count of Even value : " + count[0]);
		System.out.println("Count of Odd Value  : " + count[1]);

	}

}
