package raghu.teaching.interfface;

public class PenBookRunner {

	public static void main(String[] args) {

		Pen p1 = new StudyMaterial();

		p1.write();

		Book b1 = (Book) p1;// Perfect casting
		b1.read();

		Book b2 = new StudyMaterial();
		b2.read();

		Pen p2 = (Pen) b2;
		p2.write();

	}

}
