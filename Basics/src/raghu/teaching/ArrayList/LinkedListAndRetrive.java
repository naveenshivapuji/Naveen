package raghu.teaching.ArrayList;

import java.util.LinkedList;

public class LinkedListAndRetrive {

	public static void main(String[] args) {

		LinkedList ls = new LinkedList();
		ls.add("Raju");
		ls.add("Ramu");
		ls.addFirst("34.5");
		ls.add(23);
		System.out.println(ls);
		
//		1.By using get method
		for (int i = 0; i < ls.size(); i++) {
			System.out.println(ls.get(i));
		}
		
//		2.By using toArray
		
		
		System.out.println(ls.toArray());
	}

}
