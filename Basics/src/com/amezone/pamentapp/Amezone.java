package com.amezone.pamentapp;

public class Amezone {
	
	Product pay(Wallet w)
	{
		System.out.println("Accept payment using Wallet");
		Product p = new Product();
		return p;
	}

	Product pay(Debit d)
	{
		System.out.println("Accept payment using Debit Card");
		Product p = new Product();
		return p;
	}
	
	Product pay(Credit d)
	{
		System.out.println("Accept payment using Debit Card");
		Product p = new Product();
		return p;
	}
}
