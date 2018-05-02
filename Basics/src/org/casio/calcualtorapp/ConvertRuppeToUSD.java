package org.casio.calcualtorapp;

public class ConvertRuppeToUSD {
	
	void convertRupeesToUSD(double rupee)
	{
		double usd = rupee / 64.8;
		double comm = usd * 0.03;
		double totalvalue = usd - comm;
		System.out.println("The USD value is "+ usd);
		System.out.println("The commission in USD "+ comm);
		System.out.println("The total USD you will get is "+totalvalue);
	}

	
	public static void main(String[] args) {
		ConvertRuppeToUSD u = new ConvertRuppeToUSD();
		u.convertRupeesToUSD(5000);
		
		
	}
}

