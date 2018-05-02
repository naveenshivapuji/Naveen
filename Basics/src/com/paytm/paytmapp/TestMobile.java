package com.paytm.paytmapp;

public class TestMobile {

	public static void main(String[] args) {
		
		
		System.out.println("Open paytm app");
		Paytm p = new Paytm();
		
		p.login(9902339091L, "1234");
		p.login("naveen@qspider", "pwd");
		
	}

}
