package aorg.sample.examples;

import java.util.Scanner;

public class Marker {
	
	int price;
	String color;
	
	Marker(int price, String color)
	{
		this.price = price;
		this.color = color;
	}

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		int price = s.nextInt();
		String color = s.next();
		
		Marker m = new Marker(price, color);
			

	}

}
