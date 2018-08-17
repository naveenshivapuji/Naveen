package raghu.teaching.thiskey.constructor.chain;

public class Student {

	int sId;
	String sName;
	double sPercent;

	Student() {

	}

	Student(int sId) {
		this();
		this.sId = sId;
	}

	Student(int sId, String sName) {
		this(sId);
		this.sName = sName;
	}

	Student(int sId, String sName, double sPercent) {
		this(sId, sName);
		this.sPercent = sPercent;
	}

	void stdInfo() {
		System.out.println(sId + sName + sPercent);
	}

}
