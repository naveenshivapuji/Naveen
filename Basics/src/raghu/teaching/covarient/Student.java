package raghu.teaching.covarient;

public class Student extends Person
{

	int id;
	String stream;
	double per;
	
	
	Student(String name, int age, int id, String stream, double per) 
	{
		super(name, age);
		this.id = id;
		this.stream = stream;
		this.per = per;
	}
	
	
	void dispStudent()
	{
		System.out.println("ID : "+id);

	System.out.println("Stream " + stream);
	System.out.println("PErcentage "+ per);
	
	}
	
	void study()
	{
		System.out.println("Student stydying");
	}
	
}
