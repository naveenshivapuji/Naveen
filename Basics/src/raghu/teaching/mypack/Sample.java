package raghu.teaching.mypack;

public class Sample extends Product
{

	void print()// in the same package through inheritance
	{
		
		System.out.println("PID  : "+ pID); //Private member are not allowed
		System.out.println("PName  : " +pName);
		System.out.println("PPrice  : " +pPrice);
		System.out.println("Year Of Manufature : "+ yom);
		proInfo();
		
		
	}
	

}
