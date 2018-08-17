package raghu.teaching.contructeg;

public class MainRunner2 {
	
	
	MainRunner2()
	{
		System.out.println("I am constructor od mainrunner2 custructor ");
		
	}

	public static void main(String[] args) {

		
		new MainRunner2();
		MainRunner2 mr1 = new MainRunner2();
		MainRunner2 mr2 = new MainRunner2();
		
		mr2 = null;
	}

}
