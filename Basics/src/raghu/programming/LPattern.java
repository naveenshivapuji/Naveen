package raghu.programming;

public class LPattern {

	public static void main(String[] args) {

		int n = 15;

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (i == (n - 1) || j == 0)
					System.out.print("* ");
				else
					System.out.print("  ");

			}
			System.out.println();
		}
	}
}