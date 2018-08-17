package raghu.teaching.constructor.overload;

public class TestCar {

	public static void main(String[] args) {

		
		System.out.println("Car details are print using constructor overloading");
		Car c1 = new Car();
		c1.printCar();
		
		Car c2 = new Car("Jaguar", 5000000);
		c2.printCar();
		
		Car c3 = new Car("Mecideze", 10000000, "luxury");
		c3.printCar();
		
		
	}

}
