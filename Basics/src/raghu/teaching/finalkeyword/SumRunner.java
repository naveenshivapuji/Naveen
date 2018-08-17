package raghu.teaching.finalkeyword;

public class SumRunner {

	public static void main(String[] args) {

		Sum s1 = new Sum();
		
		// s1.a =70; // Local value cannot be changed as the values static final
		// s1.b =50; // The b value is initialized in static block and it cannot be
		// modified

		int sum = s1.a + s1.b;
		System.out.println("Sum of a and b : " + sum);

	}

}
