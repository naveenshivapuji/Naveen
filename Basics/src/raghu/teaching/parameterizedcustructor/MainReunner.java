package raghu.teaching.parameterizedcustructor;

public class MainReunner {

	public static void main(String[] args) {

		System.out.println("Main Method is created");

		Pen p1 = new Pen("Red");
		p1.write();
		Pen p2 = new Pen("Blue");
		p2.write();
		Pen p3 = new Pen("Green");
		p3.write();

	}

}
