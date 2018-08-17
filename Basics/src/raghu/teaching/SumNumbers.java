package raghu.teaching;

public class SumNumbers {

	static int sumOfNatural(int n) {

		int sum = 0;

		while (n > 0) {
			sum = sum + n;
			n--;
		}
		return sum;

	}

	public static void main(String[] args) {

		System.out.println("The sum of first  n numbers" + sumOfNatural(5));
		System.out.println("The sum of first  n numbers" + sumOfNatural(50));


	}

}
