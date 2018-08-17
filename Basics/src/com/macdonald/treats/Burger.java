package com.macdonald.treats;

public class Burger {

	String type;
	int price;
	boolean isCheesy;

	Burger(String type, int price, boolean isCheesy) {

		this.type = type;
		this.price = 100;
		this.isCheesy = isCheesy;
	}

	Burger(int price, boolean isCheesy) {

		this.type = "Veg";
		this.price = price;
		this.isCheesy = isCheesy;
	}

//	void showDetails() {
//		System.out.println(type + " " + price + " " + isCheesy);
//	}
	
	public String toString()
	{
		return this.price+" " +this.type + " "+this.isCheesy;
	}

	public static void main(String[] args) {

		Burger b1 = new Burger(80, true);
//		b1.showDetails();
		System.out.println(b1);
		
		Burger b2 = new Burger("Chicken", 100, false);
//		b2.showDetails();
		System.out.println(b2);
	}
	

}
