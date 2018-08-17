package raghu.teaching.has.a.relation;

public class Date {

	int dd,mm, yy;
	
	Date (int dd, int mm, int yy)
	{
		this.dd = dd;
		this.mm = mm;
		this.yy = yy;
		
	}
	
	String getDate()
	{
		return dd+"/"+mm+"/"+yy;
	}
	
}
