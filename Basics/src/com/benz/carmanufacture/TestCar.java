package com.benz.carmanufacture;

public class TestCar {

	public static void main(String[] args) {
		System.out.println("Creating car object");
		Car c = new Car();
		System.out.println("Creating an object p for class Petrol");
		Petrol p = new Petrol();
		Smoke whiteSmoke = c.fill(p);
		
		System.out.println(" ");
		System.out.println("Creating an object d for class Disel");
		Diesel d = new Diesel();
		c.fill(d);
		
		System.out.println(" ");
		System.out.println("Creating an object g for class Gasoline");
		Gasoline g = new Gasoline();
		c.fill(g);
	}

}
