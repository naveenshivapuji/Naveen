package raghu.teaching.thiskey;

public class TestEmployee {

	public static void main(String[] args) {

		
		System.out.println("Mein method started");
		
		Employee e1 = new Employee(101, "Raghu", 25000);
		Employee e2 = new Employee(102, "Venkat", 35000);
		
		e1.employeeInfo();
	}

}
