package raghu.teaching.vector;

import java.util.Enumeration;
import java.util.Vector;

public class VectorExample {
	public static void main(String[] args) {
		Vector v = new Vector(3, 0);//The capacity will be doubled once it reaches the max
		//Eg : 3 6 12 24 48
		v.add(34.56);
		v.add(34.56);
		v.add(34.56);
		v.add(34.56);
		v.add(34.56);
		System.out.println(v.capacity());
		v.add(34.56);
		v.add(34.56);
		v.add(34.56);
		System.out.println(v.capacity());
	    v.addElement("Raju");
		v.add(45);
		v.add(2, "Jsp");
		System.out.println(v);

		Enumeration e = v.elements();
		while (e.hasMoreElements()) {
			System.out.println(e.nextElement());
		}
	}
}
