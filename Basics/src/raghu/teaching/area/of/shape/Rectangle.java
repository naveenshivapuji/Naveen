package raghu.teaching.area.of.shape;

public class Rectangle extends Shape
{

	double l,b;

	Rectangle(double l, double b) 
	{
		this.l = l;
		this.b = b;
	}
	
	double getArea()
	{
		System.out.println("Rectangle Area");
		return l*b;
	}
	
	
}
