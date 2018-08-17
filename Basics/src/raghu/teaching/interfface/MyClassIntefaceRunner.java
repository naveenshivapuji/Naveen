package raghu.teaching.interfface;

public class MyClassIntefaceRunner {

	public static void main() {

		System.out.println("Variable from My Interface : " + MyInterface.a);

		MyInterface mi = new MyClass();
		
		mi.m1();
	}
}

