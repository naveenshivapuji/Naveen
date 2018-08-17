package raghu.teaching.vector;

import java.util.Stack;

public class StackExaple {
	public static void main(String[] args) {
		Stack stk = new Stack();
//		System.out.println(stk.pop());
//		System.out.println(stk.peek());
		stk.push("JSP");
		stk.push("Qsp");
		stk.push("JSP");
		stk.push("Rsp");
		stk.push(45.5);
		stk.push(45);
		stk.push('C');
		System.out.println(stk); //prints all data pushed to stack
		System.out.println(stk.pop()); //deletes the last in element in the stack
		System.out.println(stk);
		stk.push("Tys");
		System.out.println(stk);
		System.out.println(stk.peek());//Retrieves the last in element
		System.out.println(stk.search(45.5));//
		System.out.println(stk.search("JSP"));//first occurrence of element index is the o/p (LIFO)
	}
}
