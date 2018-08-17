package raghu.teaching;

public class SumFactorial {

	public static void main(String[] args) {

		FactOfNumber f = new FactOfNumber();

		int pn = 0;
		for (int i = 1; i <= 7; i++) {
			System.out.println(f.factNumber(i));
			pn = pn + f.factNumber(i);
		}
		System.out.println("Sum of factorial of numbers " + pn);
	}
}
