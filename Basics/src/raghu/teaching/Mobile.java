package raghu.teaching;

public class Mobile {

	void phone(String brand, String model, double price) {
		System.out.println("----Smart Phone Details-----");
		System.out.println(" Brand of the Smart Phone : " + brand);
		System.out.println(" Smart Phone Model  : " + model);
		System.out.println(" Price of the Smart Phone : " + price);

	}

	public static void main(String[] args) {

		Mobile m1 = new Mobile();
		m1.phone("Apple", "iPhone 6", 400000);

		Mobile m2 = new Mobile();
		m2.phone("Samsung", "Galaxy s5", 20000);

		Mobile m3 = new Mobile();
		m3.phone("Motorolla", "Moto G", 15000);

	}

}
