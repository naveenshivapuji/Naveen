package raghu.teaching.area.of.instance.of;

public class InstaceRunner {

	public static void main(String[] args) {

		Sample s2 = new Sample();

		display(s2);
		
		Simple s1 =new Simple();
				display(s1);

	}

	static void display(Object obj) {

		if (obj instanceof Simple)
		

		{
			Simple si = (Simple) obj;
			
			System.out.println(si.x);
			System.out.println(si.y);
			si.m1();
			
		}
		
		else if (obj instanceof Sample)
		{
			Sample sa = (Sample)obj;
			System.out.println(sa.a);
			System.out.println(sa.b);
			sa.m2();
		}

	}

}
