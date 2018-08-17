package raghu.teaching.ioprograms;

import java.io.File;

public class FileCreateFolder {

	public static void main(String[] args) {
		
		for (int i=1;i<=10;i++) {
			File f = new File("E:\\Personal2\\FileHandling"+i);
			System.out.println(f.mkdirs());
		}
	}
}
