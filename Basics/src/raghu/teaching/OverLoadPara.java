package raghu.teaching;

public class OverLoadPara {
	
	//Method overloading using number of arguments
	
	static int add(int a, int b)
	{
		return a+b;
	}
	
	static int add(int a, int b, int c)
	{
		return a+b+c;
	}
	
	public static void main(String[] args) {
		
		System.out.println("The two parameter addition " + add(4, 5));
		
		System.out.println("The three parameter addition " + add(4, 5, 6));
	}

}
