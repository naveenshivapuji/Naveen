package raghu.teaching.ioprograms;

import java.io.File;

public class FileExampleDelete {

	public static void main(String[] args) {
			File f = new File("E:\\Personal2\\FileHandling2");
			System.out.println(f.delete());
	}
}
