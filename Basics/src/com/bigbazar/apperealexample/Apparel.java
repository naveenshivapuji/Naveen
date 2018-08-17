package com.bigbazar.apperealexample;

public class Apparel {

	String type;
	String color;
	char size;
	
	Apparel(String type, String color, char size) {
		
		this.type = type;
		this.color = color;
		this.size = size;
				
	}
		
	Apparel(String type, char size) {
		this.type = type;
		this.size = size;
		this.color = "Black";
	}

	void showDetails()
	{
		System.out.println(this.type + " " + this.color + " " + this.size);
	}
	
	public static void main(String[] args) {
		
		Apparel a1 = new Apparel("Jeans", "Blue", 'M');
		
		a1.showDetails();
		
		Apparel a2 = new Apparel("T-Shirt", "Red", 'L');
		a2.showDetails();
		
		Apparel a3 = new Apparel("Shirt", 'S');
		a3.showDetails();
	}
}
