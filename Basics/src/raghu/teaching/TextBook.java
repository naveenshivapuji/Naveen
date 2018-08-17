package raghu.teaching;

public class TextBook {
	
	void bookDetails(String bookTitle,String bookAuthor, double bookPrice)
	{
		System.out.println(" Title of the book : " + bookTitle);
		System.out.println("Author of the book : " + bookAuthor);
		System.out.println(" Price of the book : " + bookPrice + "Rs");
	}

	public static void main(String[] args) {
		
		System.out.println("TEXT BOOK DETAILS");
		
		TextBook t1 = new TextBook();
		t1.bookDetails("Language C", "Dennis Ritchie", 350);
		
		TextBook t2 = new TextBook();
		t2.bookDetails("JAVA 2", "Herbert Schildt", 550);
	}

}
