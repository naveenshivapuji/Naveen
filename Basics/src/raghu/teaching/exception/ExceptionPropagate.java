package raghu.teaching.exception;

import java.io.IOException;
import java.sql.SQLException;
import java.util.Scanner;

public class ExceptionPropagate {

	public static void main(String[] args) throws SQLException {

	}

	void check(int num) throws IOException, SQLException {
		if (num > 0)
			throw new SQLException("Positive");

		else if (num < 0)
			throw new IOException("Nagative");

		else
			System.out.println("Zero");

	}

	void valid(int num) throws Exception {

		if (num > 0)
			throw new SQLException("Positive");

		else if (num < 0)
			throw new IOException("Nagative");

		else
			System.out.println("Zero");

	}
	
	void display()
	{
		System.out.println("Welcome to display : ");
		if (5!=0)
		throw new ArithmeticException();
		System.out.println("---Bye Bye---------");
	}
}
