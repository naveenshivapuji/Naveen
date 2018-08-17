package com.rollsroyce.customcar;

public class CarRolls {
	
	String brand = "Rolls Royce";
	String typeOfEngine;
	String color;
	int price;
	
	CarRolls(String typeOfEngine, String color, int price) {
		
		this.typeOfEngine = typeOfEngine;
		this.color = color;
		this.price = price;
	}
	
	CarRolls(String typeOfEngine, String color) {
		
		this(typeOfEngine, color, 25000000);
		
//		this("Deisel", color, price);		
	}
	
	CarRolls() {
		
		this("Petrol", "Black", 1500000);
		
//		this.typeOfEngine = "Petrol";
//		this.color = "Black";
//		this.price = 1500000;
	}

	public String toString()
	{
		return(this.typeOfEngine + " " + this.color + " " + this.price +" " + this.brand);
	}

	public static void main(String[] args) {
		
		CarRolls c1 = new CarRolls("Petrol", "Black", 1500000);
		System.out.println(c1);
		CarRolls c2 = new CarRolls("Diesel", "White");
		System.out.println(c2);
		CarRolls c3 = new CarRolls();
		System.out.println(c3);
		
		
	}

}
