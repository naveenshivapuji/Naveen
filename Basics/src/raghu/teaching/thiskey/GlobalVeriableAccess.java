package raghu.teaching.thiskey;

public class GlobalVeriableAccess {

		int x=100;
		void display()
		{
			int x=200;
			System.out.println("The local veriable x value : " + x);
			System.out.println("The globle veriable x value outside method :" + this.x);
		}
		//global variable x within accessed within the class scope without the this keyword
		void globVarAccess() 
		{
			System.out.println("The global veriable access withour this keyword : " + x);
		}
}
