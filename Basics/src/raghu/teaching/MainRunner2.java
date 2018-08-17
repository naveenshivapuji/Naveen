package raghu.teaching;

public class MainRunner2 {

	public static void main(String[] args) {

		{

			System.out.println("Main Method Started");
			Student1 std = new Student1();

			Employee1 emp = new Employee1();

			std.sID = 9876;
			std.sPercent = 98.6;
			std.sName = "Rajendra";

			emp.eID = 987565;
			emp.eName = "Venkat";
			emp.esal = 8765;

			display(emp);

			// display(std);
		}
	}

	static void display(Employee1 e) {
		System.out.println("Employee Name " + e.eID);
		System.out.println("Employee ID  " + e.eName);
		System.out.println(" Employee Salary " + e.esal);
	}

}
