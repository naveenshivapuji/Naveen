package raghu.teaching.staticnonstaticeg1;

public class MainRunner {

	public static void main(String[] args) {

		System.out.println("Main Method Stated ");
		Demo d1 = new Demo();
		Demo d2 = d1;
		System.out.println(Demo.x);
		d2.disp();
		System.out.println(Test.b);
		Test t1 = new Test();
		System.out.println(t1.a);
		t1.msg();
		
		
	}

}
