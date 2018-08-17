package raghu.teaching;

public class Multiplication {
	static void mulTable(int n) {

		for (int i=1; i <= 10; i++) {
			
			System.out.println(n + " * " + i + " = " + n * i);
		}
	}

	public static void main(String[] args) {
		
		System.out.println("Table 6");
		mulTable(6);
		System.out.println("Table 7");
		mulTable(7);
		System.out.println("Table 18");
		mulTable(18);

	}

}
