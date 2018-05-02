package org.casio.calcualtorapp;

public class PetrolPump {
	void calculateAmountOfPetrol(double money) {
		
	double liters = money / 74.38;
	System.out.println("You get "+ liters + "Liters of fuel");
	
	}
	
	public static void main(String[] args) {

		PetrolPump p = new PetrolPump();
		p.calculateAmountOfPetrol(500);
	
	}
	

}
