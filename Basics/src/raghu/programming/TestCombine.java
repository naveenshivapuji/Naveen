package raghu.programming;

public class TestCombine {

	
	public static void main(String[] args) {
		
		ArrayOperation a1 = new ArrayOperation();
		int a[] = a1.readArr();
		
		ArrayOperation a2 = new ArrayOperation();
		int b[] =a2.readArr();
		
		ArrayCombine a3 = new ArrayCombine();
		
		int c[] = a3.combine(a, b);
		
		a1.dispArray(c);

		
	}
}
