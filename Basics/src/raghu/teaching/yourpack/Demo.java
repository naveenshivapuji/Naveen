package raghu.teaching.yourpack;
import raghu.teaching.mypack.Product;


public class Demo 
{

	void write()
	{
		
		Product p1 = new Product();
		
		System.out.println("PID  : "+ pID); //Private member are not allowed
		System.out.println("PName  : " +pName);// default
		System.out.println("PPrice  : " +pPrice);
		System.out.println("Year Of Manufature : "+ yom);//protected
		proInfo();
	}
	
	
}
