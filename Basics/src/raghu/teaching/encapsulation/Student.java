package raghu.teaching.encapsulation;

public class Student {
	
	private int s_ID;
	private String s_Name;
	private double s_Per;
	
	
	public Student(int s_ID, String s_Name, double s_Per) {

		this.s_ID = s_ID;
		this.s_Name = s_Name;
		this.s_Per = s_Per;
	}


	public String getS_Name() {
		return s_Name;
	}


	public void setS_Name(String s_Name) {
		this.s_Name = s_Name;
	}


	public double getS_Per() {
		return s_Per;
	}


	public void setS_Per(double s_Per) {
		this.s_Per = s_Per;
	}
	
	
	
	

}
