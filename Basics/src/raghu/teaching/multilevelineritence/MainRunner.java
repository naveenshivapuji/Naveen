package raghu.teaching.multilevelineritence;

public class MainRunner {

	public static void main(String[] args) {

		Test1 t1 = new Test1();
		System.out.println(t1.x);
		t1.m1();
		
		Test2 t2 = new Test2();
		System.out.println(t2.x);
		System.out.println(t2.y);
		
		t2.m1();
		t2.m2();
		
		Test3 t3 = new Test3();
		
		System.out.println(t3.x);
		System.out.println(t3.y);
		System.out.println(t3.z);
		t3.m1();
		t3.m2();
		t3.m3();
		
		
	}

}
