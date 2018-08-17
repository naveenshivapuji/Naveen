package raghu.teaching.inheritence;

public class Strudent extends Person1 
{

	int id;
	double per;

	Strudent(String name, int age, int id, double per)
	{

		super(name, age);
		this.id = id;
		this.per = per;
	}
	
	void stdInfo()
	{
		System.out.println("Student "+name + " of age "+ age + " and id " + id + " obtained percentage " + per + " has passed the exam");
		System.out.println("Name    " + name);
		System.out.println("Age     "+ age);
		System.out.println("ID      "+id);
		System.out.println("Percent "+ per);
	}

}
