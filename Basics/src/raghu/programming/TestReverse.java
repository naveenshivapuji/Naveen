package raghu.programming;

public class TestReverse {

	public static void main(String[] args) {

		ArrayOperation a2 = new ArrayOperation();
		int c[] = a2.readArr();
		
		ArrayCombine a1 = new ArrayCombine();
		 a1.reverse(c);
		
		a2.dispArray(c);
		
	}

}
