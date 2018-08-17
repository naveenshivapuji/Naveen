package raghu.teaching.mypack;

public class Simple {
	
	void display()// is same package through object reference 
	{
		
		Product p1 = new Product();
		System.out.println(p1.pId); //Private member are not allowed
		System.out.println(p1.pName);
		System.out.println(p1.pPrice);
		System.out.println(p1.yom);
		p1.proInfo();
		
	}

}
