package com.beverage.switchstatement;

import java.util.Random;

public class CoffeeMachine {

	Beverage giveBeverage() {
		Random r = new Random();
		int option = r.nextInt(3) + 1;

		switch (option) {

		case 1:
			return new Cappaccino();
		case 2:
			return new Milk();
		default:
			return new Tea();
		}
	}

	public static void main(String[] args) {
		CoffeeMachine c = new CoffeeMachine();
		Beverage b = c.giveBeverage();

		System.out.println("Received " + b);

	}

}
