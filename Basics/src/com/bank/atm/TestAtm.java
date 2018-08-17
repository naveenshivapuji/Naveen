package com.bank.atm;

public class TestAtm {

	public static void main(String[] args) {

		Citiatm c = new Citiatm();
		c.withDraw();
		System.out.println("city withdarw");
		
		Matm m = new Matm();
		m.withDraw();
		System.out.println("hifi");
	}

}
