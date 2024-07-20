package Listexamples;

import java.util.Stack;

public class StackExamples {

	public static void main(String[] args) {
		
		Stack<String> stack = new Stack<String>();
		
		stack.push("A");
		stack.push("B");
		stack.push("C");
		
		//print and see the stack
		System.out.println("Stack elements :"+ stack);
		
		stack.pop();
		System.out.println("After popping an element : "+ stack);
		
		System.out.println("Top Element :" +stack.peek());
		
		System.out.println("Searching the element A :"+stack.search("A"));
		
		System.out.println("Searching an element which is not present :"+ stack.search("x"));
		
		
	}
}
