package aorg.sample.examples;

public class Widening {

	public static void main(String[] args) {

		byte b = 25;
		System.out.println("The value stored int he byte is " + b);
		
		short s = b;
		System.out.println("Byte widened  to short to store " + s);
		
		int i = s;
		System.out.println("Shote is widened to int " + i);
		
		long l = i;
		System.out.println("Integer is widened to long " + l);
		
		
	}

}
