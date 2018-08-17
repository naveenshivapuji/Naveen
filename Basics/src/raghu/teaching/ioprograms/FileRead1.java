package raghu.teaching.ioprograms;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class FileRead1 {

	public static void main(String[] args) throws Exception {

		File f = new File("E://Personal2");
		String[] files = f.list();
		Scanner sc = new Scanner(System.in);
		System.out.println("-------Document Files-------");
		for (int i = 0; i < files.length; i++) {
			
			if (files[i].endsWith(".doc"))
				System.out.println(files[i]);
		}
		System.out.println("Which file you want to read : ");
		String fName = sc.next();
		
		FileInputStream fin = new FileInputStream("E://Personal2"+fName);
		System.out.println("-: File Content :-");
		int i;
		while((i = fin.read())!=-1){
			System.out.println((char)i);
		}
	}
}
