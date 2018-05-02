package com.qspider.idgenerator;

public class TestIdCard {

	public static void main(String[] args) {
		IdCard i1 = new IdCard();
		System.out.println(i1);
		System.out.println(i1.name + " " + i1.mobilenumber + " " + i1.branch);
		i1.name = "naveen";
		i1.mobilenumber = 9902339091L;
		i1.branch = "BTM";
		System.out.println(i1.name + " " + i1.mobilenumber + " " + i1.branch);		
	}

}
