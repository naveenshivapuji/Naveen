package raghu.teaching.student;

public class Student {

	int sId;
	String sName;
	double sPer;
	
	Student(int id, String name, double per)
	{
		sId = id;
		sName =name;
		sPer = per;
	}
	
	void dispStd()
	{
		System.out.println("Name : " +sName);
		System.out.println("Percentage " + sPer);
		System.out.println("ID  " + sId);
	}
}
