package com.amezone.pamentapp;

public class Testamezone {

	public static void main(String[] args) {
		System.out.println("Opening the Amezone Wensite");
		Amezone a = new Amezone();
		System.out.println("We have Debit Card");
		Debit d = new Debit();
		System.out.println("making payment");
		Product product = a.pay(d);
		
	}

}