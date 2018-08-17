package com.sangeetha.mobilephone;

public class TestPhone {

	public static void main(String[] args) {

//		Pro p = new Pro();
//		Samsung s = p;
//		Galaxy g = (Galaxy) s;		
		
		Samsung s = new Pro();
		if (s instanceof Galaxy) {
			Galaxy g = (Galaxy) s;
			g.shakePhone();
			g.faceRecognition();
		}
			else if (s instanceof Pro) {
				Pro p = (Pro) s;
				p.infraRed();
				p.shakePhone();
			}
			
		
		
		
	}

}
