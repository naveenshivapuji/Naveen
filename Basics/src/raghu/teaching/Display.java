package raghu.teaching;

public class Display {
	
	//Method overloading using data type
	
	static void display(String s) {
		System.out.println("The string passed is : " + s);
	}
	
	static void display(int a) {
		System.out.println("The integer parameter passed is " + a);
	}
	
	static void display(double d) {
		System.out.println("The double parameter passed is " + d);
	}

	public static void main(String[] args) {
		
		display(20.12);
		display(200);
		display("Java Class");

	}

}
