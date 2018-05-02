package org.bluestar.acmanufacture;

public class TestAC {

	public static void main(String[] args) {
		
		AirConditioner ac = new AirConditioner();
		
		System.out.println("w object is created");
		Water w = new Water();
		System.out.println("Blows the Air");
		Air a = ac.blow(w);
		System.out.println("Room gets cooled");
		
	}

}
