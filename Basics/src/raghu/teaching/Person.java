package raghu.teaching;

public class Person {

	void personDetails(String name, String gender, int age, long mobNum) {
		System.out.println("Person named " + name + " of age " + age + " having phone number " + mobNum + " is a " + gender);
	}

	public static void main(String[] args) {

		System.out.println("---Personal Details----");

		Person p1 = new Person();
		p1.personDetails("Naveen", "male", 40, 9902339091L);

		Person p2 = new Person();
		p2.personDetails("Mahesh", "male", 35, 9898989898L);

		Person p3 = new Person();
		p3.personDetails("Kavitha", "female", 30, 8079675648L);

		Person p4 = new Person();
		p4.personDetails("Savitha", "female", 25, 8767856745L);
	}

}
