package raghu.teaching;

public class Employee {
	
	String empName;
	int empID;
	double empSalary; 
	
	void employeeDetails()
	{
		System.out.println("----The Employee Details-----");
	}

	public static void main(String[] args) {
		
		Employee e1 = new Employee();
		Employee e2 = new Employee();
		Employee e3 = new Employee();
		Employee e4 = new Employee();
		
		e1.employeeDetails();
		
		System.out.println("ID of the Employee : " +e1.empID);
		System.out.println("Employee Name  : " + e1.empName);
		System.out.println("Employee Salary : " + e1.empSalary);
		
		e1.empID = 1234;
		e1.empName = "Naveen";
		e1.empSalary = 10000;
		
		e1.employeeDetails();
		System.out.println("ID of the Employee : " +e1.empID);
		System.out.println("Employee Name  : " + e1.empName);
		System.out.println("Employee Salary : " + e1.empSalary);
		
		
		e2.empID = 1235;
		e2.empName = "Venkat";
		e2.empSalary = 20000;
		
		e2.employeeDetails();
		System.out.println("ID of the Employee : " +e2.empID);
		System.out.println("Employee Name  : " + e2.empName);
		System.out.println("Employee Salary : " + e2.empSalary);
		
		e3.empID = 1236;
		e3.empName = "Mahesh";
		e3.empSalary = 15000;
		
		e3.employeeDetails();
		System.out.println("ID of the Employee : " +e3.empID);
		System.out.println("Employee Name  : " + e3.empName);
		System.out.println("Employee Salary : " + e3.empSalary);
		
		e4.empID = 1237;
		e4.empName = "Raghu";
		e4.empSalary = 25000;
		
		e4.employeeDetails();
		System.out.println("ID of the Employee : " +e4.empID);
		System.out.println("Employee Name  : " + e4.empName);
		System.out.println("Employee Salary : " + e4.empSalary);
		
	}

}
