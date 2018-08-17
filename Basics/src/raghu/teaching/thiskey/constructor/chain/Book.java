package raghu.teaching.thiskey.constructor.chain;

public class Book {
	
	String name;
	double price;
	
	public Book(String name, double price)
	{
		this.name = name;
		this.price = price;
	}
	
	public Book(double price, String name)
	{
		
		this(name,price);
	}
	
	void bookInfo()
	{
		System.out.println("Name " + name + "Price " + price);
	}

}
