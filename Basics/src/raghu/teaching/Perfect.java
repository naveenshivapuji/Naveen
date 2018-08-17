package raghu.teaching;

public class Perfect {
	
	static boolean isPerfect(int n) {
		
		int sum=0, i=1;
		
		do {
			if(n%i == 0)
				sum = sum + i;
			i++;
		}while (i<= n/2);
		return sum == n;
		
	}

	public static void main(String[] args) {

		boolean rs = isPerfect(28);
				
				if (rs==true)
					System.out.println("The numbers is PERFECT");
				else System.out.println("Number i NOT PERFECT");
		
	}

}
