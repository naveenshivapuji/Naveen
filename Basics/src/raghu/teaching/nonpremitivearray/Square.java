package raghu.teaching.nonpremitivearray;

public class Square implements Shape{
	
	double side;

	public Square(double side) {
		this.side = side;
	}

	public double getArea() {
		return side*side;
	}

	@Override
	public String toString() {
		return "Square [side=" + side + "]";
	}
	
	
	
	

}
