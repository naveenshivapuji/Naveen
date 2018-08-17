package raghu.teaching.interfface;

public class InterfaceRunner {

	public static void main(String[] args) {

		MyInterface1 mi1 = new YourClass();
		
		mi1.disp();
		
		MyInterface2 mi2 = (MyInterface2)mi1;
		
		mi2.print();
		
		MyClass1 mc1 = (MyClass1)mi1;
		
		mc1.write();
		
		
		
	}

}
