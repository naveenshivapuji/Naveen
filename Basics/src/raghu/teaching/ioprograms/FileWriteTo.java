package raghu.teaching.ioprograms;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileWriteTo {

	public static void main(String[] args) throws Exception {
		String st = "Java is a object oreinted language";

		byte b[] = st.getBytes();
		FileOutputStream fout = null;

		try {
			fout = new FileOutputStream("E://Personal2//Write.doc");
			fout.write(b);
			fout.flush();
			System.out.println(" File written successfully ");
		} catch (IOException e) {

			e.printStackTrace();
		}
	}
}
