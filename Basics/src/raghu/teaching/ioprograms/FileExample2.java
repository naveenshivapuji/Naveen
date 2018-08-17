package raghu.teaching.ioprograms;

import java.io.File;
// To print all files and folders under a directory
public class FileExample2 {

	public static void main(String[] args) {

		File f = new File("E:\\Personal2");
		String[] files = f.list();
		System.out.println("No of files : " + files.length);

		//Display all files and folders in the given path.
		for (int i = 0; i < files.length; i++) {
			System.out.println(files[i]);
		}
		System.out.println("==================================");
		//To display the all files with the given extension example .doc
		
		for (int i = 0; i < files.length; i++) {
			if (files[i].endsWith(".doc"))
			System.out.println(files[i]);
		}
	}
}
