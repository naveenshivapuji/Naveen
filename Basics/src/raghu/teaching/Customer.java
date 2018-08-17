package raghu.teaching;

public class Customer
{
	String cName;
	String cID;
	long cMob;
	
	
	void custInfo() {
		
		System.out.println("------CUSTOMER INFORMATION----");
		System.out.println("Customer Name : " + cName);
		System.out.println("Customer ID : " + cID);
		System.out.println("Customer :  " + cMob);

	}

	public static void main(String[] args) { 

		
		Customer c1 = new Customer();
		Customer c2 = new Customer();
		Customer c3 = new Customer();
		
		c1.custInfo();
		
		c1.cName = "Naveen";
		c1.cID = "9876";
		c1.cMob = 9902339091L;
		
		c1.custInfo();
		
		c2.cName = "Rajesh";
		c2.cID = "nh76";
		c2.cMob = 987654323L;
		
		c2.custInfo();
		
		c3.cName = "Venkat";
		c3.cMob = 987654321L;
		c3.cID = "JH45";
		
		c3.custInfo();
	}

}
