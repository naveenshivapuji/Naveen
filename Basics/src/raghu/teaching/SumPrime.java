package raghu.teaching;

public class SumPrime {

	public static void main(String[] args) {

		Prime p = new Prime();

		int sum = 0;
		{

			for (int i = 1; i <= 100; i++) {
				boolean pn = p.isPrime(i);

				if (pn) {
					sum = sum + i;
				}
			}
			System.out.println("count of prime numbers " + sum);
		}
	}

}
