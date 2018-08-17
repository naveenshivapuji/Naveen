package aorg.sample.examples;

public class Laptop {
	
	int dellInspiron = 25000;
	int dellLattitude = 35000;
	static int basePrice = 20000;
	
	int ausesViobook =20000;
	int ausesVivobook1 = 30000;
	static int basePrice1 = 18000;
	
	void dispPrice()
	{
		System.out.println("This is and instance method");
		
		System.out.println(dellInspiron);
		System.out.println(dellLattitude);
		System.out.println(Laptop.basePrice);
		
		System.out.println(ausesViobook);
		System.out.println(ausesVivobook1);
		System.out.println(basePrice1);
	}
	
	static void showPrice()
	{
		System.out.println("This is an Static method");
		
		System.out.println(basePrice);   // OR System.out.println(Laptop.basePrice);
		System.out.println(Laptop.basePrice1);	// OR System.out.println(basePrice1);
		
		System.out.println("Accessing instance varibles using an object");		
		Laptop l2 = new Laptop();
		System.out.println(l2.dellInspiron);
		System.out.println(l2.dellLattitude);
		System.out.println(l2.ausesViobook);
		System.out.println(l2.ausesVivobook1);
		
	}
	
	
	public static void main(String[] args) {
		
		Laptop l = new Laptop();
		l.dispPrice();
		
		Laptop.showPrice();
		
	}
	
}
