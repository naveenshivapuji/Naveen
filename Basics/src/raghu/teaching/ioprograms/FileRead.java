package raghu.teaching.ioprograms;

import java.io.File;
import java.io.FileInputStream;

public class FileRead {
	public static void main(String[] args) throws Exception {

		FileInputStream fin = null;
		fin = new FileInputStream("E://Personal2//Address proof letter.doc");
		int i, count = 1;
		while ((i = fin.read()) != -1) {
			if (i == '\n')
				count++;
		}
		System.out.println("The number of lines : " + count);
	}
}
