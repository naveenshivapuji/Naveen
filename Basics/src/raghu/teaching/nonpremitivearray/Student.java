package raghu.teaching.nonpremitivearray;

public class Student implements Person{

	int stdId;
	String stdname;
	double stdPer;
	int stdAge;
	
	


	public Student(int stdId, String stdname, double stdPer, int stdAge) {
		this.stdId = stdId;
		this.stdname = stdname;
		this.stdPer = stdPer;
		this.stdAge = stdAge;
	}




	public int compareAge() {
		return stdAge;
	}




	@Override
	public String toString() {
		return "Student [stdId=" + stdId + ", stdname=" + stdname + ", stdPer=" + stdPer + ", stdAge=" + stdAge + "]";
	}
	
	
	
	
	
}
