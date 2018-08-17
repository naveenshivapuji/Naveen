package raghu.teaching;

public class Show {
	// Method overloading using the sequence of the arguments 
	
	static void add(int a, double d)
	{
		System.out.println("The first parameter is integer" + (a+d));
	}

	static void add(double d, int a)
	{
		System.out.println("The first parameter is double " + (d+a));
	}
	public static void main(String[] args) {
		

		add(12.5, 5);
		add(10, 5.5);
	}

}
