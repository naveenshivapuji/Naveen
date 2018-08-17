package raghu.teaching.constructor.overload;

public class TestEmployee {

	public static void main(String[] args) {

		System.out.println("Mein method started");

		Employee e1 = new Employee();
		Employee e2 = new Employee(102);
		Employee e3 = new Employee(104, " Venkat");
		Employee e4 = new Employee(106, "Raghu", 2333.44);

		e1.employeeInfo();
		e2.employeeInfo();
		e3.employeeInfo();
		e4.employeeInfo();
	}

}
