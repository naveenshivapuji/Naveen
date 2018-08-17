package raghu.teaching;

public class TypeSequence {

	static void demo(int a, double d) {
System.out.println("int and double");
	}

	
	static void demo(double a, int d) {
		System.out.println("int and double");
			}
	public static void main(String[] args) {
		
		demo(10, 23.32);
		demo(23.43, 50);

	}

}
