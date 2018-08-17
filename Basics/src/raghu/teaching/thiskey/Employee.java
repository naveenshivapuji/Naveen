package raghu.teaching.thiskey;

public class Employee {

	int id;
	String name;
	double salary;
	
	public Employee(int id, String name, double salary)
	{
		
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	
	void employeeInfo()
	{
		System.out.println("Employee " + name + " having employee id  " + id + " is getting Salary " + salary);
	}
}
