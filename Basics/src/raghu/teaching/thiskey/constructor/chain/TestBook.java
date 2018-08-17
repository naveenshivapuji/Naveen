package raghu.teaching.thiskey.constructor.chain;

public class TestBook {

	public static void main(String[] args) {
		
		
		System.out.println("Main method started");
		
		Book b1 = new Book(100.50, "JAVA");
		b1.bookInfo();
		
		Book b2 = new Book("C++", 500.60);
		b2.bookInfo();
	}
}
