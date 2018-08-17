package raghu.teaching.constructor.overload;

public class Employee {

	int id;
	String name;
	double salary;

	Employee() {
	}

	Employee(int id) {
		this.id = id;
	}

	Employee(int id, String name) {
		this.id = id;
		this.name = name;
	}

	Employee(int id, String name, double salary) {

		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	void employeeInfo() {
		System.out.println("Employee " + name + " having employee id  " + id + " is getting Salary " + salary);
	}
}
