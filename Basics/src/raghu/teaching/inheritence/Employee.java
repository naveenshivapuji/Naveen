package raghu.teaching.inheritence;

public class Employee extends Person

{

	int id;
	double sal;
	
	void working()
	{
		System.out.println("Working...");
		
	}
	
	void empInfo()
	{
		System.out.println("Name : " + name);
		System.out.println("Age : "+ age);
		System.out.println("ID : "+ id);
		System.out.println("Salary : "+sal);
	}
}
