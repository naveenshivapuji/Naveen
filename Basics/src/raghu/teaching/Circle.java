package raghu.teaching;

import java.util.Scanner;

public class Circle {

	static int radious(int diameter) {

		int radious = (diameter / 2);
		return radious;
	}

	static void divThree() {

		System.out.print("Numbers divisible from three are");
		for (int i = 0; i <= 100; i++) {
			if (i % 3 == 0)
				System.out.print(" " + i);

		}
		return;
	}

	static void numEvenOdd() {

		int even = 0, odd = 0;
		for (int i = 1; i <= 100; i++) {
			if (i % 2 == 0) {
				even = even + 1;
			} else {
				odd = odd + 1;
			}
		}

		System.out.println("Even Count " + even);
		System.out.println("Odd Count " + odd);

	}

	public static void main(String[] args) {

		Scanner d = new Scanner(System.in);
		System.out.println(" Enter the diameter fo a circle : ");
		int diameter = d.nextInt();
		System.out.println("Radious of the Circle is : " + radious(diameter));

		System.out.println(" ");
		divThree();

		System.out.println(" ");
		System.out.println(" ");
		numEvenOdd();
	}

}
