package raghu.teaching.objectclass;

public class MainRunner2 {

	public static void main(String[] args) {

		Object obj1 = new Object();
		
		System.out.println(obj1.hashCode());
		
		Simple s1 = new Simple();
		System.out.println(s1.hashCode());
		
		Demo d1 = new Demo();
		System.out.println(d1.hashCode());
		
		
		Students std1 = new Students(123, "Raghu", 57.6);
		System.out.println(std1.hashCode());
		
		Students std2 = new Students(145, "Anjitha", 90.5);
		System.out.println(std2.hashCode());
		
	}

}
