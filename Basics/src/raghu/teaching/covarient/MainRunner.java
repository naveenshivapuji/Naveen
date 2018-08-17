package raghu.teaching.covarient;

public class MainRunner {

	public static void main(String[] args) {

		
		Student s1 = new Student("Rajesh", 45, 1234, "Engineering", 68.6);
		s1.eat();
		s1.study();
		s1.dispPerson();
		s1.dispStudent();
		System.out.println(s1.name);
		System.out.println(s1.stream);
		System.out.println("-------------------------------");
		
		
		Person p1 = new Person("Mahesh", 35);
		
		p1.eat();
		System.out.println(p1.name);
		System.out.println(p1.age);
		p1.dispPerson();
		System.out.println("-------------------------------");
		
		Person per = new Student("Venakat", 38, 1265, "BCom", 87.8);
		
		System.out.println(per.age);
		System.out.println(per.name);
		per.dispPerson();
		
		
	}

}
