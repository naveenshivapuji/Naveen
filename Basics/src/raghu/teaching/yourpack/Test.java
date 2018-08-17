package raghu.teaching.yourpack;

import raghu.teaching.mypack.Product;

public class Test extends Product
{

	void screen()//in another package through inheritance 
	{
		System.out.println("PID  : "+ pID); //private member
		System.out.println("PName  : " +pName);// default
		System.out.println("PPrice  : " +pPrice);
		System.out.println("Year Of Manufature : "+ yom);//protected
		proInfo();
	}

}
