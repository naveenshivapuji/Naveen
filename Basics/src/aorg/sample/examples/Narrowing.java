package aorg.sample.examples;

public class Narrowing {

	public static void main(String[] args) {

		long l = 127;
		System.out.println("the value of long " + l);
		
		int i = (int)l;
		
		short s = (short)i;
		
		byte b = (byte)s;
		
		System.out.println(l + " " + i +  " "+ " " + s + " " +  b);
		
	}

}
