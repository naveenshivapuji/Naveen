package raghu.teaching.area.of.shape;

public class Circle extends Shape
{

	double r;

	Circle(double r) 
	{
		this.r = r;
	}
	
	double getArea()
	{
		
		System.out.println("Circle Area");
		
		return 3.143*r*r;
		
	}
	
	
}
