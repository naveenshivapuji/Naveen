package raghu.teaching;

public class StringBuilderCapacityAndLength {

	public static void main(String[] args) {

		System.out.println("-------------String----------");
		String str = new String();
		System.out.println(str);//0
		
		System.out.println("-----------String Bulilder----------");
		StringBuilder buld = new StringBuilder();
		System.out.println(buld.capacity());//16
		System.out.println(buld.length());//0
		buld.trimToSize();
		System.out.println(buld.capacity());//The size of the buld object size is trimmed to string length i.e 0 
		//String is appended to the existing string for same object which is not true in String object.
		System.out.println(buld.append("How are you !")); 
		System.out.println(buld.append(" 485"));
		System.out.println(buld.delete(0, 2));//delete 2 character from the 0th index
		System.out.println(buld.deleteCharAt(7));
		
		System.out.println("------String Buffer----------");
		StringBuffer buf = new StringBuffer("Hello World"); 
		System.out.println(buf.capacity()); //16+11 =27
		System.out.println(buf.length());// 11 the string length
		buf.trimToSize();
		System.out.println(buf.capacity());//The size of the buf object size is trimmed to string length i.e 11 
		//String is appended to the existing string for same object which is not true in String object.
		System.out.println(buf.append(" How are you !"));
		System.out.println(buf.append(" 485"));
		System.out.println(buf.delete(0, 3));//delete 3 character from the 0th index
		System.out.println(buf.deleteCharAt(3));
		
		
		
		
		
	}

}
