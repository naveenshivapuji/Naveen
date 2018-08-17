package raghu.teaching.hashcode;

public class HashcodeExample {

	int id;
	String name;
	double per;

	public HashcodeExample(int id, String name, double per) {
		this.id = id;
		this.name = name;
		this.per = per;
	}

	public String toString() {
		return "HashcodeExample [" + id + "," + name + "," + per + "]";
	}

	public int hashCode() {
//		return id;
//		return name.hashCode();
		return new Double(per).hashCode();
	}

	public boolean equals(Object obj) {
		return this.hashCode() == obj.hashCode();
	}
}
