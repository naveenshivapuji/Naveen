package raghu.teaching;

public class ReuseMethod {

	static int add(int a, int b)
	{
		return a+b;
	}
	
	static String concat(String s1, String s2)
	{
		return s1+s2;
	}
	
	public static void main(String[] args) {

		int x=10, y=20, z=30;
		
		int sum = add(x,y);
		
		sum = add(sum, z);
		
		System.out.println(sum);
		
		
		
	}

}
