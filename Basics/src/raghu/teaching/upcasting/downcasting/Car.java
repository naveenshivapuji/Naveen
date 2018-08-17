package raghu.teaching.upcasting.downcasting;
 public class Car extends Vehicle
{

	String cName;
	
		
	Car(int cc, String cName)
	{
		super(cc);
		this.cName = cName;
	}
	
	void drive()
	{
		System.out.println("Car is Moving");
	}
	
	void model()
	{
		System.out.println(cName + "2018");
	}
	
	void carVerient()
	{
		System.out.println("vehicle Hiline");
	}

	
	
}
