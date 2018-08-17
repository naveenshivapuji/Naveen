package raghu.teaching;

public class TypeSequence1 {

	
	static void think(char ch, int a)
	{
		System.out.println("Char and int ");
	}
	
	static void think(int a, char ch)
	{
		System.out.println("int and char ");
	}
	public static void main(String[] args) {

		
		//think(10, 10); // ambiguty
		think(10, 'A');
		
		think('B', 20);
		
	}

}
