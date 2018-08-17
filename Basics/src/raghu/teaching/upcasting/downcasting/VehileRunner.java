package raghu.teaching.upcasting.downcasting;

public class VehileRunner {

	public static void main(String[] args) {

		Vehicle v = new Car(1950, "ValksVagan");
		
		System.out.println(v.cc);
		v.drive();
		v.model();
		
		Car c = (Car) v;
		
		System.out.println(c.cc);
		
		System.out.println(c.cName);
		c.drive();
		c.model();
		c.carVerient();
		
	}

}
