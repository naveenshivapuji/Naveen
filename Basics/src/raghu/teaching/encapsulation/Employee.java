package raghu.teaching.encapsulation;

public class Employee {

	private int e_ID;
	private String e_Name;
	private double e_Sal;
	
	
	Employee(int e_ID, String e_Name, double e_Sal) {

		this.e_ID = e_ID;
		this.e_Name = e_Name;
		this.e_Sal = e_Sal;
	}


	public String getE_Name() {
		return e_Name;
	}


	public void setE_Name(String e_Name) {
		this.e_Name = e_Name;
	}


	public double getE_Sal() {
		return e_Sal;
	}


	public void setE_Sal(double e_Sal) {
		this.e_Sal = e_Sal;
	}
	
	
	
	
	
}
