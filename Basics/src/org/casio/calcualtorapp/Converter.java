package org.casio.calcualtorapp;

public class Converter {

	double convertDegreeToFah(double celcious)
	{
		double farenheat = celcious * 1.8 + 32;
		return farenheat;
	}
	
	double convertFarenheatToCelcious(double farenheat)
	{
		double celcious = (farenheat - 32)/1.8;
		return celcious;
	}



public static void main(String[] args)

{
	System.out.println();
}
}