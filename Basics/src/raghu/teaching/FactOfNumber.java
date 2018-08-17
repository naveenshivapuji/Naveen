package raghu.teaching;

public class FactOfNumber {
	
	
	static int factNumber(int n){
		
		int fact = 1;

		while (n > 0 ) {
			fact = fact * n;
			n--;
		}
		return fact;
		
	}

	public static void main(String[] args) {

		
		System.out.println("Factorial of the number " + factNumber(5));
		System.out.println("Factorial of the number " + factNumber(6));

		
		
	}

}
