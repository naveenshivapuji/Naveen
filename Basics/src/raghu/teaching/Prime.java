package raghu.teaching;

public class Prime {

	
	static boolean isPrime(int n) {
		
		int i = 2;
		while (i<n/2) {
			if (n % i == 0) {
				return false;
			}
			i++;
		}
		return true;
	}
	
	public static void main(String[] args) {

		for (int i = 1; i<=100; i++)
		{
			boolean pn = isPrime(i);
			
			 if (pn) {
				 System.out.println(i);
			}
		}
		}
		
		
	}


