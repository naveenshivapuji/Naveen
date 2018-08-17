package raghu.teaching.inheritence;

public class MainRunner {

	public static void main(String[] args) {

		
		Employee e1 = new Employee();
		
		e1.empInfo();
		System.out.println(e1.name);
		System.out.println(e1.id);
		
		e1.working();
		e1.eating();
		e1.sleeping();
	}

}
