package org.casio.calcualtorapp;

public class GSTCalculator {
	void calculateGST(double productPrice)
	{
		double gst = productPrice * 0.18;
		double totalCost = productPrice+gst;
		System.out.println("The base price of the cost is "+ productPrice);
		System.out.println("The GST of the product is "+ gst);
		System.out.println("The total cost of the product "+totalCost);
		
	}
public static void main(String[] args)
{
	GSTCalculator g = new GSTCalculator();
	g.calculateGST(155);
}
}
