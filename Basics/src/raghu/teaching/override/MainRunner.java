package raghu.teaching.override;

public class MainRunner {

	public static void main(String[] args) {

		Animal a1 = new Animal();
		a1.noise();
		
		Dog d1 = new Dog();
		d1.noise();
		
		
		Animal a2 = new Dog();
		a2.noise();
		
		Animal f1 = new Fish();
		f1.noise();
	}

}
