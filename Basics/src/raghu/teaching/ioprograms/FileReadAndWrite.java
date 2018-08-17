package raghu.teaching.ioprograms;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileReadAndWrite {

	public static void main(String[] args) throws Exception {

		File f = new File("E://Personal2//Address proof letter.doc");
		String[] files = f.list();
		FileInputStream fin = null;
		FileOutputStream fout = new FileOutputStream("E://Personal2//MergedFile.doc");
		for (int i = 0; i < files.length; i++) {
			if (files[i].endsWith(".doc")) {
				fin = new FileInputStream("E://Personal2//" + files[i]);
				int j;

				while ((j = fin.read()) != -1) {
					System.out.println((char) j);
					Thread.sleep(2000);
					fout.write(j);
				}
				fin.close();
			}
		}
		fout.flush();
		fout.close();
		System.out.println("-------------:: Copy 100% complete ::--------------");
	}
}
