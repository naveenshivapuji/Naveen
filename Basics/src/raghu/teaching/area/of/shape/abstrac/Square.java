package raghu.teaching.area.of.shape.abstrac;


public class Square extends Shape
{

	double side;

	Square(double side)
	{
		this.side = side;
	}
	
	double getArea()
	{
		System.out.print("Square Area : ");
		return side*side;
	}
	
}
