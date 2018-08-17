package raghu.teaching.nonpremitivearray;

public class Circle implements Shape
{
	double radious;

	
	public Circle(double radious)
	{
		this.radious=radious;
	}
	
	public double getArea() {
		return 3.14 *radious*radious;
	}

	public String toString() {
		return "Circle [radious=" + radious + "]";
	}

	
	
}
