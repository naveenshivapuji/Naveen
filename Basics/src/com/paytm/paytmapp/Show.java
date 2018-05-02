package com.paytm.paytmapp;

public class Show {

	void show()
	{
		disp();
		System.out.println("Show Method");
	}
	
	void disp()
	{
		//show();  //Stack overflow error occurs 
		System.out.println("Display Method");
	}
	
	public static void main(String[] args) {
		Show s = new Show();
		s.show();
	}
}

