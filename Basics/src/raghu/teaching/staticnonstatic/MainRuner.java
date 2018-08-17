package raghu.teaching.staticnonstatic;

public class MainRuner {

	public static void main(String[] args) {

		System.out.println("Main Method started");
		
		System.out.println("Static methods are called using the class neame directly");
		System.out.println("Value of y Static Member "+Sample.y);
		Sample.m2();
		
		
		//Non Static methods are called using the object 
		Sample s1 = new Sample();
		s1.m1();
		
		
	}

}
