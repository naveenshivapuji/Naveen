package raghu.teaching;

public class StringBuilderConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s1 = "Rajesh";

		StringBuilder sb1 = new StringBuilder("Rajesh");

		System.out.println(s1);
		System.out.println(sb1);

		String s2 = s1.concat(" Joshi"); // s1 is not modified s2 new string object created after concat
		sb1.append(" Joshi");

		System.out.println(s1);
		System.out.println(sb1);
		System.out.println(s2);
	}

}
