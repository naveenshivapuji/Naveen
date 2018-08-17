package raghu.teaching.nonpremitivearray;

public class MainShapeRunner {

	public static void main(String[] args) {

		
		Shape sh[] = {new Circle(2.5), new Rectangle(4.5, 54.5), new Square(5.5)};
		
		for (int i = 0; i < sh.length; i++) {
			
			System.out.println(sh[i]);
			System.out.println("Area is "+sh[i].getArea());
			System.out.println("-------------------------------");
			
		}
		
		
	System.out.println("Big area shape");
	Shape big = sh[0];
	
	
		for (int i = 0; i < sh.length; i++)
		
		{
			if (sh[i].getArea()>big.getArea())
			
			big=sh[i];
		}
		
		
		System.out.println(big);
		System.out.println("Area is "+ big.getArea());
		
	}

}
