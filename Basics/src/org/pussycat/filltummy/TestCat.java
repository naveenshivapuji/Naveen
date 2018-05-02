package org.pussycat.filltummy;

public class TestCat {
	
	
	public static void main(String[] args) {
		
		
		Cat c = new Cat();
		Fish f = new Fish();
		Cheese ch = new Cheese();
		
		c.eat(f);
		c.eat(ch);
	}

}
