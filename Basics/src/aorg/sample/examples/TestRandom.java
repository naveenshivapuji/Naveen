package aorg.sample.examples;

import java.util.Random;

public class TestRandom {

	public static void main(String[] args) {

		Random r = new Random();

		System.out.println(r.nextInt(6) + 1); // radom no between 1 to 6

		System.out.println(r.nextInt(10));

		System.out.println(r.nextFloat());

		System.out.println();

	}

}
