package raghu.teaching.mypack;

public class Product 
{

	private int pID;
	String pName;
	protected int yom;
	public double pPrice;

	void proInfo() //All the access modifiers are allowed within the class 
	{
		System.out.println("PID  : " + pID);
		System.out.println("PName  : " + pName);
		System.out.println("PPrice  : " + pPrice);
		System.out.println("Year Of Manufature : " + yom);
	}
}
