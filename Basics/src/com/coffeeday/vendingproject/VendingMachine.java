package com.coffeeday.vendingproject;

public class VendingMachine {
	
	Coffee prepare(CoffeeBean  cof)
	{
		System.out.println("Prepare Coffee");
		Coffee coff = new Coffee();
		return coff;
	}
	
	AppleJuice prepare(Apple aj)
	{
		System.out.println("Prepare Apple Juice");
		AppleJuice appj = new AppleJuice();
		return appj;
	}
	
	ColdWater prepare(Water w)
	{
		System.out.println("Prepare Cold Water");
		ColdWater cldwat = new ColdWater();
		return cldwat;
	}

}
