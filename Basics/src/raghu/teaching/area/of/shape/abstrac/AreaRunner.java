package raghu.teaching.area.of.shape.abstrac;

import java.util.Scanner;

public class AreaRunner {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		Shape sh[] = { new Circle(2.5), new Square(3.5), new Rectangle(3.4, 4.5) };

		System.out.println(sh[0].getArea());
		System.out.println(sh[1].getArea());
		System.out.println(sh[2].getArea());
	}

}
