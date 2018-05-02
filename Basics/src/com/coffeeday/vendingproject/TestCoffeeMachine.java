package com.coffeeday.vendingproject;

public class TestCoffeeMachine {

	public static void main(String[] args) {
		VendingMachine vm = new VendingMachine();
		CoffeeBean cof = new CoffeeBean();
		vm.prepare(cof);
		
		System.out.println(" ");
		Apple aj = new Apple();
		vm.prepare(aj);
		
		System.out.println(" ");
		Water cw = new Water();
		vm.prepare(cw);
	}

}
