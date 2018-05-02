package com.mi.unlockapp;

public class TestMobile {

	public static void main(String[] args) {
		
		System.out.println("To unlock use pattern");
		Pattern p = new Pattern();
		Mobile m = new Mobile();
		m.unlock(1234);
	}

}
