package raghu.teaching.nonpremitivearray;

public class Employee implements Person
{
	
	int empId;
	String empName;
	double empSalary;
	int empAge;
	
	
	

	public Employee(int empId, String empName, double empSalary, int empAge) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.empSalary = empSalary;
		this.empAge = empAge;
	}




	
	@Override
	public int compareAge() {
		// TODO Auto-generated method stub
		return empAge;
	}





	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", empSalary=" + empSalary + ", empAge=" + empAge
				+ "]";
	}

	
	
}
