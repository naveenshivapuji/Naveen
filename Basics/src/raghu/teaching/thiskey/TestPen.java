package raghu.teaching.thiskey;

public class TestPen {

	public static void main(String[] args) {

		System.out.println("Main method is started");
		Pen p1 = new Pen("Red");
		Pen p2 = new Pen("Blue");
		
		p1.write();
		p2.write();
	}

}
