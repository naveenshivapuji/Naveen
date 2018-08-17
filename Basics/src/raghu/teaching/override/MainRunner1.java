package raghu.teaching.override;

public class MainRunner1 {

	public static void main(String[] args) {

		Simple s1 = new Simple();
		s1.display();
		s1.print();
		
		Sample s2 = new Sample();
		s2.display();
		s2.print();
		
		Simple s3 = new Sample();
		
		s3.display();
		s3.print();
//		s3.display(10);
	}

}
