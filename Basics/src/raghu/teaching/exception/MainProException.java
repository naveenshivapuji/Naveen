package raghu.teaching.exception;

import java.io.IOException;
import java.sql.SQLException;

public class MainProException {

	public static void main(String[] args) throws Exception{

		ExceptionPropagate propagate = new ExceptionPropagate();
		
		try {
			propagate.check(5);
		} catch (IOException | SQLException e) {
			e.printStackTrace();
		}
		
		propagate.valid(4);
		
		propagate.display();

	}

}
