package raghu.teaching.collections;

public class Student {
	
	int id;
	String name;
	double per;
	
	public Student(int id, String name, double per) {
		this.id = id;
		this.name = name;
		this.per = per;
	}
	
	public String toString() {
		return "[" + id + "," + name + "," + per + "]";
	}
	

}
