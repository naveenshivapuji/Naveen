package raghu.teaching;

public class StringBuilderAndBuffer {

	public static void main(String[] args) {

		String s1 = "Rajesh";
		
		StringBuilder sb1 = new StringBuilder("Rajesh");
		StringBuilder sb2 = new StringBuilder("Rajesh");
		
		System.out.println(sb1.hashCode());
		System.out.println(sb2.hashCode());
		
		System.out.println(sb1);
		System.out.println(sb2);
		
		System.out.println(s1.equals("Rajesh"));//equals method of the String class compares the content
		System.out.println(sb1.equals(sb2));//equals method of the StringBuilder of the StringBuffer compares the address
	}
}
