package raghu.teaching.constructor.overload;

public class Car {

	String brand;
	int price;
	String clas;

	Car() {

	}

	Car(String brand, int price) {

		this.brand = brand;
		this.price = price;
	}

	Car(String brand, int price, String clas) {

		this.brand = brand;
		this.price = price;
		this.clas = clas;
	}

	void printCar() {
		System.out.println(brand + " car " + " of rupees " + price + " is " + clas + " class.");
	}
}
