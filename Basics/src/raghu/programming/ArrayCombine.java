package raghu.programming;

public class ArrayCombine {
	
	//combine two arrays

	int[] combine(int a1[], int a2[]) {
		int rs[] = new int[a1.length + a2.length];

		for (int i = 0; i < a1.length; i++) {
			rs[i] = a1[i];
		}

		for (int i = 0; i < a2.length; i++) {
			rs[a1.length + i] = a2[i];
		}

		return rs;
	}
	
	
	//reverse the array elements
	
	public void reverse(int[] a)
	{
		for (int i=0; i< a.length/2; i++)
		{
			int temp = a[i];
			a[i] = a[a.length-1-i];
			a[a.length-1-i] = temp;
	
	}
	
	}
	
}
