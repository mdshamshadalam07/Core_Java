package com.nit.java;

import java.util.Stack;

public class Test04_Stack {
	public static void main(String args []) {
		
		  Stack<Object> s = new Stack<>();
		  
		  s.push("a");
		  s.push("b");
		  s.push("c");
		  s.push("d");
		  s.push("e");
		  
		  System.out.println(s);
		  
		  System.out.println(s.pop());
		  System.out.println(s);
		  
		  System.out.println(s.pop());
		  System.out.println(s);
		  
		  
		  System.out.println(s.peek());
		  System.out.println(s);
		  
		  
		  System.out.println(s.peek());
		  System.out.println(s);
		  
		  System.out.println(s.search("a"));
		  
		  s.add("x");
		  System.out.println(s);
		  
		  System.out.println(s.get(2));
		  
		  
		  
	}
}
