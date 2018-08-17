package raghu.teaching.thiskey.constructor.chain;

public class TestStudent {

	public static void main(String[] args) {

		Student s1 = new Student(123, "Naveen", 78.8);
		Student s2 = new Student(124, "Raghu");
		Student s3 = new Student(125);
	
		s3.stdInfo();
		s2.stdInfo();
		s1.stdInfo();
	}
	

}
