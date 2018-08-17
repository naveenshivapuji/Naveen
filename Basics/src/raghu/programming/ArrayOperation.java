package raghu.programming;

import java.util.Scanner;

public class ArrayOperation {

	int[] readArr() {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the length of array1");
		int n = sc.nextInt();
		int ar[] = new int[n];
		System.out.println("Enter " + n + "values");
		for (int i = 0; i < n; i++) {
			ar[i] = sc.nextInt();
		}
		return ar;
	}

	void dispArray(int[] ar) {
		for (int i = 0; i < ar.length; i++) {
			System.out.println(ar[i] + " ");
		}
		System.out.println();
	}

	int sumOfArray(int[] a) {
		int sum = 0;
		for (int i = 0; i < a.length; i++) {
			sum += a[i];
		}
		return sum;
	}

	int[] combine(int a1[], int a2[]) {
		int rs[] = new int[a1.length + a2.length];

		for (int i = 0; i < a1.length; i++) {
			rs[i] = a1[i];
		}

		for (int i = 0; i < a2.length; i++) {
			rs[a1.length + i] = a2[i];
		}

		return rs;
	}

	// reverse the array elements

	public void reverse(int[] a) {
		for (int i = 0; i < a.length / 2; i++) {
			int temp = a[i];
			a[i] = a[a.length - 1 - i];
			a[a.length - 1 - i] = temp;

		}

	}

	// insert element in the array

	int[] inserArr(int a[], int in, int ele) {
		if (in < 0 || in > a.length) {
			System.out.println("Index out of range");
			return a;
		}

		int na[] = new int[a.length + 1];

		for (int i = 0; i < a.length; i++) {
			if (i < in)
				na[i] = a[i];
			else
				na[i + 1] = a[i];
		}
		na[in] = ele;
		return na;
	}
}
