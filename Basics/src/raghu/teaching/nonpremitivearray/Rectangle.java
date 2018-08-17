package raghu.teaching.nonpremitivearray;

public class Rectangle implements Shape
{
	
	double length;
	double breadth;
	
	
	public Rectangle(double length, double breadth) {
		this.length = length;
		this.breadth = breadth;
	}


	public double getArea() {
		return length*breadth;
	}


	@Override
	public String toString() {
		return "Rectangle [length=" + length + ", breadth=" + breadth + "]";
	}
	
	
	
	
	

}
