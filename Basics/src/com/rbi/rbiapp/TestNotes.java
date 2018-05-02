package com.rbi.rbiapp;

public class TestNotes {

	public static void main(String[] args) {
		Notes n1 = new Notes();
		Notes n2 = new Notes();
		Notes n3 = new Notes();
		
		System.out.println(n1); //Displays the reference of the object n1
		
		n1.colorOfNote = "Green";
		n1.valueOfNote = 50;
		n1.lengthOfNote = 10;
		n1.gandhiPicture = true;
		
		n2.colorOfNote = "Pink";
		n2.valueOfNote = 2000;
		n2.lengthOfNote = 14;
		
		n3.colorOfNote = "Blue";
		n3.valueOfNote = 100;
		n3.lengthOfNote = 11;
		
		System.out.println(n1.valueOfNote + " rupees note is " + n1.colorOfNote + " in color and has " + n1.lengthOfNote + "cm length" + n1.gandhiPicture);
		System.out.println(n2.valueOfNote + " rupees note is " + n2.colorOfNote + " in color and has " + n2.lengthOfNote + "cm length");
		System.out.println(n3.valueOfNote + " rupees note is " + n3.colorOfNote + " in color and has " + n3.lengthOfNote + "cm length");
		
		System.out.println(n1.valueOfNote + " rupees note is " + n2.colorOfNote + " in color and has " + n3.lengthOfNote + "cm length");
		
	}

}
