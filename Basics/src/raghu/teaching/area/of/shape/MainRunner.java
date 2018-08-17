package raghu.teaching.area.of.shape;

import java.util.Scanner;

public class MainRunner {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		Shape sh =null;
		System.out.println("1.Circle , 2 Square, 3 Rectangle ");
		
		int ch = sc.nextInt();
		switch(ch)
		{
		
		case 1 : 
			sh= new Circle(3.5);
		break;
		case 2 : 
			sh= new Square(5.5);
		break;
		default : 
			sh =new Rectangle(3.0, 4);
		break;
		
		
		}
		
		System.out.println(sh.getArea());
	}
	

}
