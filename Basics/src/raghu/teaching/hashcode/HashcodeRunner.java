package raghu.teaching.hashcode;

import java.util.HashSet;
import java.util.Iterator;

public class HashcodeRunner {

	public static void main(String[] args) {

		HashSet hs = new HashSet();
		
		hs.add(new HashcodeExample(121, "Ramesh", 55.5));
		hs.add(new HashcodeExample(123, "Rajesh", 65.5));
		hs.add(new HashcodeExample(124, "Rupesh", 75.5));
		hs.add(new HashcodeExample(121, "Rakesh", 55.5));
		hs.add(new HashcodeExample(125, "Rupesh", 55.5));

		Iterator it = hs.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
	}

}
