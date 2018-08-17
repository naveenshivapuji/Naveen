package raghu.teaching.ioprograms;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Scanner;

public class FileStudentMainRunner {

	public static void main(String[] args) throws IOException {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the Studetn name : ");
		String name = sc.next();
		System.out.println("Enter the Student ID : ");
		int id =sc.nextInt();
		System.out.println("Enter the Studetn Percentage");
		double per = sc.nextDouble();
		FileStudent StudentObj = new FileStudent(id, name, per);
		FileOutputStream fout = new FileOutputStream("E://Personal2//test1.txt");
		ObjectOutputStream Obj = new ObjectOutputStream(fout);
		Obj.writeObject(StudentObj);
		Obj.flush();
		fout.flush();
		Obj.close();
		fout.close();
		
		
	}

}
