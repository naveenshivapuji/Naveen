package raghu.teaching.covarient;

public class Person 
{
	String name;
	int age;
	public Person(String name, int age)
	{
		this.name = name;
		this.age = age;
	}
	
	void dispPerson()
	{
		System.out.println("Name " +name);

		System.out.println("Age"+ age);
	}
	
	void eat()
	{
		System.out.println("Person is eating");
	}
}
