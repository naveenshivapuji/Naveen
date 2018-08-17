package raghu.teaching.exception;

import java.util.Scanner;

public class CreateException1 {

	public static void main(String[] args) {
		// TODO Auto-generated method

		int a, b, sum = 0;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a : ");
		a = s.nextInt();
		System.out.println("Enter b : ");
		b = s.nextInt();

		try {
			if (a < b)
				throw new ArithmeticException("fist value is greater than second");
			sum = a + b;
			System.out.println("sun is : " + sum);
		} catch (ArithmeticException e) {
			System.out.println("Addition is not possible ");
		}

		System.out.println("Thanks for the exception");
	}

}
