package com.benz;

public class Car {

	int price;

	Car(int price) {

		super();
		this.price = price;
	}
	@Override
	public String toString() {             //Method Overriding 
		return "Car price is " + price;
	}

	public static void main(String[] args) {

		Car c = new Car(2000000);

		System.out.println(c.getClass().getName() + "@" + Integer.toHexString(c.hashCode()));
		System.out.println(c); // Car price is 2000000

		Car c1 = new Car(5000000);
		System.out.println(c1);

		System.out.println(Integer.toHexString(10));

	}

}
