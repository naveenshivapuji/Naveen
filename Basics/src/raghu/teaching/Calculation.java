package raghu.teaching;

public class Calculation {

	static void arithOperation(int a, int b) {

		int sum = a + b;
		System.out.println("Sum of " + a + " + " + b + " = " + sum);
		
		int subtract = a - b;
		System.out.println("Substraction of " + a + " + " + b + " = " + subtract);

		int div = a / b;
		System.out.println("Division of " + a + " + " + b + " = " + div);

		int modulus = a % b;
		System.out.println("Modulus of " + a + " + " + b + " = " + modulus);

	}

	public static void main(String[] args) {

		System.out.println("Operation");
		arithOperation(2, 3);

		arithOperation(5, 3);

		arithOperation(60, 6);

	}

}
