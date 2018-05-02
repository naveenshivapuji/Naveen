package com.benz.carmanufacture;

public class Car {
	
	Smoke fill(Petrol p)
	{
		System.out.println("Accepting the petrol");
		Smoke s = new Smoke();
		System.out.println("Smoke is returned");
		return s;
	}
	
	Smoke fill(Diesel d)
	{
		System.out.println("Accepting Diesel");
		Smoke s = new Smoke();
		System.out.println("Smoke is returned");
		return s;
	}
	
	Smoke fill(Gasoline g)
	{
		System.out.println("Accepting Gasoline");
		Smoke s = new Smoke();
		System.out.println("Smoke is returned");
		return s;
	}
	

}
