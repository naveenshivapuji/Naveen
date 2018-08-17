package raghu.teaching.finalkeyword;

public class Additon {

	public static void main(String[] args) {

		display();

	}

	static void display() {
		
		final int a = 10;
		int b = 20;

		// a=35;// we cannot alter the value of a since variable a has 10 as final.
		// 

		int sum = a + b;
		System.out.println("Sum  " + sum);
	}

}
