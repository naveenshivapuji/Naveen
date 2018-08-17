package raghu.teaching.ioprograms;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class FileStudentRead {

	public static void main(String[] args) throws IOException, ClassNotFoundException {

		FileInputStream fin = new FileInputStream("E://Personal2//test1.txt");

		ObjectInputStream oin = new ObjectInputStream(fin);
		Object obj = oin.readObject();
		System.out.println(obj);
		FileStudent st = (FileStudent)obj;
		System.out.println(st.sname);
		System.out.println(st.std);
		System.out.println(st.per);
	}
}
