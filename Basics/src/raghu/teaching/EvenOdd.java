package raghu.teaching;

public class EvenOdd {
	
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
		
		numEvenOdd();

	}

}