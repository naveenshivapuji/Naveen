package org.casio.calcualtorapp;

public class GenDec {
	
	String genderDecision(int no) {
		
		String gen;
		if (no == 1) {
	
			gen = "Boy";
		}
		else if (no == 2)
		{
			gen = "Girl";
			
		}
		else {
			gen = "Nill";
		}
		
		return gen;
	}
	
	
	public static void main(String[] args) {
		
		GenDec g = new GenDec();
		System.out.println("Gender " + g.genderDecision(10)	);
	}

}
