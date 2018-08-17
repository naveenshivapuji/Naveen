package raghu.teaching.area.of.shape.abstrac;

public class Rectangle extends Shape 
{

	double l, b;

	Rectangle(double l, double b) 
	{
		this.l = l;
		this.b = b;
	}

	double getArea() 
	{
		System.out.print("Rectangle Area : ");
		return l * b;
	}

}