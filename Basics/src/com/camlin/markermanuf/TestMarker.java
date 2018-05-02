package com.camlin.markermanuf;

public class TestMarker {

	
	public static void main(String[] args) {

		Marker m1 = new Marker();
		System.out.println(m1);
		
		m1.showDetaild();
		
		//System.out.println(m1.color + " " + m1.brand + " " + m1.price);
		m1.color = "Black";
		m1.showDetaild();
		//System.out.println(m1.color + " " + m1.brand + " " + m1.price ); //After assigning the value for string
		
		
		Marker m2 = new Marker();
		System.out.println(m2);
		m2.showDetaild();// color is null
		m2.color = "Red";
		m2.showDetaild();//color is red
		
	}

}
