package org.needs.human;

public class TestGenaral {

	public static void main(String[] args) {
		
		Boy boy = new Boy();
		boy.dress();
		boy.learn();
		
		Girl girl = new Girl();
		girl.dress();
		girl.learn();
		
		//Boys and Girls are up casted to Student class
		
		Student stud = boy;
		stud.learn();
		
		Student stud1 = girl;
		stud1.learn();
		
		Ring r = new Ring();
		r.gold();
		r.wedRing();
		
		Chain ch = new Chain();
		ch.gold();
		ch.dimondNeckless();
		
		//Ring and Chain are up casted to Jewels
		
		Jewels j = r;
		j.gold();
		
		Jewels j1 = ch;
		j1.gold();
		
		Jewels j2 = new Jewels();
		j2.gold();
		
		Potato p = new Potato();
		p.color();
		p.grow();
		p.available();

		Brinjol b = new Brinjol();
		b.color();
		b.grow();
		b.available();

		Cabbage c = new Cabbage();
		c.color();
		c.grow();
		c.available();

		// Potato, Brinjol and Cabbage are up casted to Vegitables

		Vegitable v = p;
		v.available();
		v.grow();

		Vegitable v1 = b;
		v1.available();
		v1.grow();

		Vegitable v2 = c;
		v2.available();
		v2.grow();

		Tomato t = new Tomato();

		t.color();
		t.region();
		t.shapeOfFruit();

		Apple a = new Apple();
		a.color();
		a.region();
		a.shapeOfFruit();

		// Tomato and Apple are up casted to Fruit

		Fruit f = t;
		f.shapeOfFruit();

	}

}
