package raghu.teaching.constructorparameterized;

public class MainRunner {
	
	//Example for parameterized and no parameterized and default constructor 

	public static void main(String[] args) {

		
		System.out.println("Main method started");
		
		Sample s1 = new Sample(); //Non Parameterized constructor
		Sample s2 = new Sample(20); //Parameterized constructor
		
		Test t1 = new Test(); //default constructor created by the compiler
	}

}
