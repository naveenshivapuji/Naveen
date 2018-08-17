package com.mobilephone;

public class TestPhone {

	public static void main(String[] args) {

		Samsung s = new Samsung();
		
		s.price = 25000;
		s.color = "Black";
		s.brand = "Samsung";
		s.call();
		s.sms();
		System.out.println(s);
		System.out.println(s.price + " "+ s.brand + " " + s.color);
		
		NokiaPhone n = new NokiaPhone();
		
		n.price = 80000;
		n.color = "White";
		n.brand = "Nokia";
		n.call();
		n.sms();
		System.out.println(n);
	
	}

}
