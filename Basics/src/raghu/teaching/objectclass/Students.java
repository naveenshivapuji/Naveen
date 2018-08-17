package raghu.teaching.objectclass;

public class Students {

	int id;
	String name;
	double  per;
	
	
	public Students(int id, String name, double per) {
		this.id = id;
		this.name = name;
		this.per = per;
	}
	
	public String toString()
	{
		return "Student [ " +id+","+name+","+per+" ]";
	}
	
	
	public int hashCode()
	{
		return id;
	}
	
	
	public boolean equals(Object obj)
	{
		if (obj instanceof Students)
	{
		
		Students s = (Students)obj;
		return s.per==per;
	}

	return false;
	}
}
