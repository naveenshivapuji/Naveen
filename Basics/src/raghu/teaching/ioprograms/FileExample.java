package raghu.teaching.ioprograms;

import java.io.File;

public class FileExample {

	public static void main(String[] args) {

		File f = new File("E:\\Personal2");
		System.out.println(f.exists());
		System.out.println(f.isDirectory());
		System.out.println(f.isFile());
		
		File f1 = new File("E:\\Personal2\\Address proof letter.doc");
		System.out.println(f1.exists());
		System.out.println(f1.isDirectory());
		System.out.println(f1.isFile());
		System.out.println(f1.getPath());
		System.out.println(f1.getParentFile());
		
		File f3 = new File("E:\\Personal2","Address proof letter.doc" );
		System.out.println(f3.exists());
		System.out.println(f1.isDirectory());
		System.out.println(f1.isFile());
		System.out.println(f1.getPath());
		System.out.println(f1.getParentFile());
	}
}
