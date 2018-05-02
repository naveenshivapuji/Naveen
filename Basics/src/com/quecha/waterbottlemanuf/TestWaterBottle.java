package com.quecha.waterbottlemanuf;

public class TestWaterBottle {
	public static void main(String[] args) {
		WaterBottle w1 = new WaterBottle();
		WaterBottle w2 = new WaterBottle();
		WaterBottle w3 = new WaterBottle();
		
		System.out.println(w1.color);
		System.out.println(w2.color);
		w1.color = "blue";
		w3.price = 500;
		System.out.println(w3.color);
		System.out.println(w3.price);
		System.out.println(w1.color);
		
	}

}
