package raghu.teaching.has.relation;

public class Car {

	String cName;
	double price;
	String color;
	Engine en;
	
	
	Car(String cName, double price, String color, int cc)
	{
		en = new Engine(cc);
		this.cName = cName;
		this.color = color;
		this.price = price;
	}
	
	void drive()
	{
		en.start();
		System.out.println("Car is moving");
	}
}
