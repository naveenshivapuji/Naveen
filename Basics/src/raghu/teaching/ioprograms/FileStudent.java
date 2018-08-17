package raghu.teaching.ioprograms;

import java.io.Serializable;

public class FileStudent implements Serializable {
	
	int std;
	String sname;
	double per;
	public FileStudent(int std, String sname, double per) {
		this.std = std;
		this.sname = sname;
		this.per = per;
	}
	public String toString() {
		return "FileStudent [stdu=" + std + ", Name=" + sname + ", Percentage=" + per + "]";
	}
}