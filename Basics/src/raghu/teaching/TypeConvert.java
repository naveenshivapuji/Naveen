package raghu.teaching;

public class TypeConvert {

	static void task(int a, int b)
	{
		System.out.println("A value " + a);
		System.out.println("B value " + b);
	}
	
	static void task(char a, char b)
	{
		System.out.println("A value " + a);
		System.out.println("B value " + b);	}
	
	public static void main(String[] args) {
		
		task(10,20);
		task('A', 'S');
		byte x =20, y = 33;
		task(x, y);
		short s1 = 20, s2 = 45;
		task(s1, s2);

	}

}
