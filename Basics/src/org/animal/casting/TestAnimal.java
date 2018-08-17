package org.animal.casting;

public class TestAnimal {

	public static void main(String[] args) {

		Monkey m = new Monkey();
		m.eat();
		m.Sleep();
		m.jump();
		
		Animal a = m;  // Upcasting Monkey class and will not be able to access jump() since upcasted.
		a.eat();
		a.Sleep();
		a.toString();
		
		Lion l = new Lion();
		Animal a1 = l;
		a1.eat();
		
	}

}
