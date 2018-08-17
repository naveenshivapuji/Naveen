package raghu.teaching;

public class Pen {

	String color;
	String cName;
	double price;

	void write() {
		System.out.println("The pen is used to write");
	}

	public static void main(String[] args) {

		Pen p1 = new Pen();
		Pen p2 = new Pen();

		p1.color = "RED";
		p1.cName = "CELLOW";
		p1.price = 25.50;

		p2.color = "Blue";
		p2.cName = "Rynolds";
		p2.price = 30.50;
		
		p1.write();
		
		System.out.println("Color  " + p1.color);
		System.out.println("Company Name  " + p1.cName);
		System.out.println("Pen Price " + p1.price);
		
		p2.write();

		System.out.println("Color  " + p2.color);
		System.out.println("Company Name  " + p2.cName);
		System.out.println("Pen Price " + p2.price);


	}

}
