package raghu.teaching.multilevelineritence;

public class MainRunner1 {

	public static void main(String[] args) {

		
		Fruits f1 = new Fruits();
		f1.print();
		
		Fruits f2 = new Mango();
		f2.print();
		
		Mango m1 = new Mango();
		m1.print();
		
		Fruits f3 = new Raspuri();
		f3.print();
		
		Raspuri r1 = new Raspuri();
		r1.print();
	}

}
