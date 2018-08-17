package raghu.teaching.area.of.shape.abstrac;

public class Circle extends Shape 
{

	double r;

	Circle(double r) 
	{
		this.r = r;
	}

	double getArea()
	{
		System.out.print("Circle Area : ");
		return 3.143 * r * r;
	}

}