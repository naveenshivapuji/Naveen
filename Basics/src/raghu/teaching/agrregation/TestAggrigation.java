package raghu.teaching.agrregation;

public class TestAggrigation {

	public static void main(String[] args) {

		System.out.println("Main Method ");
		
		Address ban = new Address("Bangalore", "Karnataka", "INDIA");
		Address mum = new Address("Mubai", "Maharastra", "INDIA");
		Address bbsr = new Address("BBSR", "Odissa", "INDIA");
		
		ban.state = "KARNATAKA";
		
		
		
		Employee e1 = new Employee("Naveen", 1234, 40000, ban);
		Employee e2 = new Employee("Rajesh", 1235, 50000, mum);
		Employee e3 = new Employee("Kumar", 1236, 25000, bbsr);
		Employee e4 = new Employee("Sharan", 1237, 60000, ban);
		Employee e5 = new Employee("Venkat", 1238, 70000, ban);
		Employee e6 = new Employee("Raju", 1239, 80000, bbsr);
		Employee e7 = new Employee("Mahesh", 1240, 10000, ban);
		
		e1.personInfo();
		e2.personInfo();
		e3.personInfo();
		e4.personInfo();
		e5.personInfo();
		e6.personInfo();
		e7.personInfo();
		
		
	}

}
