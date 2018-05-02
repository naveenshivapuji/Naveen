package org.costructormarkerexample;

public class Marker {
	
	String color;
	int price = 50;
	String brand = "Camlin";
	
	Marker(String color) //Custom constructor 
	{
		this.color = color;
	}
	
	public static void main(String[] args) {
		
		Marker m1 = new Marker("Black");
		
		Marker m2 = new Marker("Red");
		
		//Marker m3 = new Marker(); //Since we have already defined the constructor is will not allow create general object
	}

}
