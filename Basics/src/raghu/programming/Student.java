package raghu.programming;

public class Student {
	
	static int cCode;
	int studID;
	String sName;
	double sPercentage;
	
	void Student()
	{
		System.out.println("--- Student Database---");
		
	}
	public static void main(String[] args) {
		
		
		Student.cCode = 420;
		
		Student s1 = new Student();
		
		Student s2 = new Student();
		
		s1.Student();
		
		s1.studID = 1234;
		s1.sName = "Ramesh";
		s1.sPercentage = 73.5;
		
		s2.studID = 1235;
		s2.sName = "Suresh";
		s2.sPercentage = 78.5;
		

	}

}
