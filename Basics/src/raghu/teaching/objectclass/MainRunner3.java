package raghu.teaching.objectclass;

public class MainRunner3 {

	public static void main(String[] args) {

		
		
		Object obj1 = new Object();
		
		Object obj2 = new Object();
		
		
		System.out.println(obj1.equals(obj2));
		
		System.out.println(obj2.equals(obj1));
		
		System.out.println(obj1.equals(obj1));
		
		Simple s1 = new Simple();
		
		System.out.println(s1.equals(obj1));
		System.out.println(obj1.equals(s1));
		
		Demo d1 = new Demo();
		Demo d2 = new Demo();
		System.out.println(d2.equals(d1));
		
		Students std1 = new Students(125, "Naveen", 67.5);
		Students std2 = new Students(126, "Mahesh", 47.5);
		Students std3 = new Students(127, "Rajesh", 67.5);

		
		System.out.println(std1.equals(std2));
		System.out.println(std1.equals(std3));
		
		
	}

}
