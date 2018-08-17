package raghu.teaching.ioprograms;

import java.io.FileInputStream;

public class FileInputByLine {

	public static void main(String[] args) throws Exception {

		FileInputStream fin =null;
		fin = new FileInputStream("E://Personal2//Address proof letter.doc");
		int i;
//		System.out.println(fin.a);
		int count = 1;
		while((i = fin.read())!=-1);
		{
			if (i=='\n')
				count++;
		}
		System.out.println(count);
		
		
	}

}
