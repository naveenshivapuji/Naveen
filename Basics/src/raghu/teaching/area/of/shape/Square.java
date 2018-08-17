package raghu.teaching.area.of.shape;

public class Square extends Shape
{

	double side;

	Square(double side)
	{
		this.side = side;
	}
	
	double getArea()
	{
		System.out.println("Square Area");
		
		return side*side;
	}
	
}
