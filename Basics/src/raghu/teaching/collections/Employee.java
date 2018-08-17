package raghu.teaching.collections;

public class Employee {

	int id;
	String name;
	double sal;

	public Employee(int id, String name, double sal) {
		this.id = id;
		this.name = name;
		this.sal = sal;
	}

	public String toString() {
		return "Employee [Emp Id = " + id + ", Emp Name = " + name + ", Emp Sal = " + sal + "]";
	}

}
