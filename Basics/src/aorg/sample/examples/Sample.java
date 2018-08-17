package aorg.sample.examples;

public class Sample {
	
	int x = 10;
	static int y = 20;
	
	void disp()
	{
		this.m();
		Sample.show();
		System.out.println(x);
		System.out.println(Sample.y);
		
	}
	
	static void show()
	{
		Sample.x();
		Sample s = new Sample();
		s.m();
	}

	public static void main(String[] args) {
		
		Sample.show();
		Sample s = new Sample();
		s.disp();
	}
	void m()
	{
		System.out.println("M Method");
	}
	
	static void x()
	{
		System.out.println("X Method");
		System.out.println(y);
	}

}
