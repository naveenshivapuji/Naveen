package com.beverage.userinput;

import java.util.Scanner;

public class CoffeeMachine {

	void giveBeverage() {

		System.out.println("Please enter choice of your beverage :");
		
		Scanner option = new Scanner(System.in);

		int select = option.nextInt();

		switch (select) {

		case 1:
			Milk m = new Milk();
			m.toString();
			return;

		case 2:
			Tea t = new Tea();
			t.toString();
			return;

		default:
			Cappuccion c = new Cappuccion();
			c.toString();
			return;

		}

	}
	
	public static void main(String[] args) {
		
		CoffeeMachine cm = new CoffeeMachine();
		
		cm.giveBeverage();
		
	}
}
