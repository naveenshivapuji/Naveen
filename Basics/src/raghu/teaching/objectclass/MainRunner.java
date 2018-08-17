package raghu.teaching.objectclass;

public class MainRunner {

	public static void main(String[] args) {

		
		Object obj1 = new Object();
		Object obj2 = new Object();
		
		
		
		System.out.println(obj1.toString());
		System.out.println(obj2.toString());
		
		Simple s1 = new Simple();
		
		System.out.println(s1.toString());
		
		Demo d1 = new Demo();
		System.out.println(d1.toString());
		
		Students std = new Students(111, "Naveen", 55.5);
		
		System.out.println(std.toString());
		System.out.println("------------------------------");
		
		System.out.println(obj1);
		System.out.println(obj2);
		System.out.println(s1);
		System.out.println(d1);
		System.out.println(std);
	}

}
