package raghu.teaching;

public class PrimeCount {

	public static void main(String[] args) {
		
		Prime p = new Prime();

		int count = 0;
		{

			for (int i = 1; i<=100; i++)
			{
				boolean pn = p.isPrime(i);
				
				 if (pn) {
					 count++;
				 }
			}
			System.out.println("count of prime numbers " + count);
			}
	}

}
