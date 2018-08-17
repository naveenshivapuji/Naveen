package raghu.teaching.agrregation;

public class StringClass {

	public static void main(String[] args) {

//1
		String s1 = new String();
		System.out.println(s1);
		System.out.println(s1.toString());
		System.out.println(s1.length());
//2
		String s2 = new String("Rajesh");
		System.out.println(s2);
		System.out.println(s2.toString());
		System.out.println(s2.length());
//3
		char ch[] = { 'R', 'A', 'M', 'A' };
		String s3 = new String(ch);
		System.out.println(s3);
		System.out.println(s3.toString());
		System.out.println(s3.length());

	}

}
