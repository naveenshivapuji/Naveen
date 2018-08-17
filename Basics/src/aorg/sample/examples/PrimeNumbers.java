package aorg.sample.examples;

public class PrimeNumbers {

	public static void main(String[] args) {
		
		int count =0;
		for (int i=0; i<=1000; i++)
		{
			if (isPrime(i))
			{
				count++;   //for sum of prime numbers sum=sum+i;
			}
		}

		
	}

	static boolean isPrime(int n) {
		int i = 2;
		while (i <= 2) {
			if (n % i == 0) {
				return false;
			}
			i++;
		}
		return true;
	}

}
