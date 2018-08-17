package raghu.teaching.nonpremitivearray;

public class MainAgeRunner {

	public static void main(String[] args) {

		//Person pr[] = { new Student(25), new Employee(35), new Customer(55) };
		
		Person pr[] = {new Student(123, "Naveen", 55.5, 25), new Employee(124, "Venkat", 45000, 35),
				new Customer(134, 987898783L, 55)};

		System.out.println("Elder Person");

		Person elder = pr[0];
		
		Person youngest = pr[0];

		for (int i = 1; i < pr.length; i++)
		{
			System.out.println(pr[i]);
			if (pr[i].compareAge() > elder.compareAge())
			{
				elder = pr[i];
			}

		}

		System.out.println(elder);
		System.out.println(elder.compareAge());
		
		System.out.println("-----------------------------");
		
		for (int i = 0; i < pr.length; i++) {
			
			if (pr[i].compareAge() < elder.compareAge())
			{
				elder = pr[i];
			}
			
		}
		
		System.out.println(youngest);
		System.out.println(youngest.compareAge());

	}

}
