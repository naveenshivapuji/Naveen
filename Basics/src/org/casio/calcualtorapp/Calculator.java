package org.casio.calcualtorapp;

public class Calculator {
	int add(int num1, int num2)
	{
		int res = num1+num2;
		return res;
	}
	
	int subtract(int num1, int num2)
	{
		int res = num1-num2;
		return res;
	}
	
	int multiply(int num1, int num2)
	{
		int res = num1*num2;
		return res;
	}
	
	int division(int num1, int num2)
	{
		int res = num1/num2;
		return res;
	}
	
	int square(int num1)
	{
		int res = num1*num1;
		return res;
	}
	
	int cubeOfNumber(int num1)
	{
		int res = num1*num1*num1;
		return res;
	}
	
	int convertHourToMinute(int hour)
	{
		int minutes = hour*60;
		return minutes;
	}
			
	public static void main(String[] args) {
		Calculator  c = new Calculator();
		int result = c.add(25, 35);
		System.out.println(result);
		System.out.println(c.add(21, 21));
		System.out.println(c.subtract(50, 25));
		System.out.println(c.multiply(5, 5));
		System.out.println(c.square(65));
		System.out.println(c.division(50, 2));
		System.out.println(c.square(5));
		System.out.println(c.cubeOfNumber(5));
		System.out.println(c.convertHourToMinute(2));
		
	}

}
