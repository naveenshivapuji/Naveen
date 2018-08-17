package raghu.teaching.parameterizedcustructor;

public class Pen {

	String color;
	
	Pen (String col)
	{
		color = col;
		System.out.println("Pen object is created");
	}
	
	void write()
	{
		System.out.println(color + " color pen will write");
	}
	
}
