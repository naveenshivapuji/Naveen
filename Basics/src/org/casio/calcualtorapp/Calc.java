package org.casio.calcualtorapp;

public class Calc {
	// A Method for addition which accepts 2,3,4, as parameters
	
	int addTwoParameter(int number1, int number2)
	{
		int sum = number1 + number2;
		return sum;
	}
	
	int addThreeParamenters(int number1, int number2, int number3)
	{
		int sum = number1 + number2 + number3;
		return sum;
	}
	
	int addFourParamenters(int number1, int number2, int number3, int number4)
	{
		int sum = number1 + number2 + number3 + number4;
		return sum;
	}

	public static void main(String[] args) {
		// A Calc method is called in the main program
		
			
		Calc c = new Calc();
		System.out.println("The sum of the two numbers = "+ c.addTwoParameter(10, 4));
		System.out.println("The sum of the three numbers = "+ c.addThreeParamenters(10, 20, 30));
		System.out.println("The sum of the four numbers = "+ c.addFourParamenters(1, 2, 3, 4));

		int addition2 = c.addTwoParameter(2, 2);
		System.out.println("Two numbers " + addition2);
		int addition3 = c.addThreeParamenters(3, 3, 3);
		System.out.println("Three numbers " +addition3);
		int addition4 = c.addFourParamenters(4, 4, 4, 4);
		System.out.println("Three numbers "+addition4);
	}

}
