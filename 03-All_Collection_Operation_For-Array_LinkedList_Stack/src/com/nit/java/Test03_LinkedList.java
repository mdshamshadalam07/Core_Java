package com.nit.java;

import java.util.LinkedList;

public class Test03_LinkedList {
	public static void main(String args []) {
		
	  LinkedList<Object> ll = new LinkedList<>();	
  	  System.out.println("Size:" +ll.size());
  	  System.out.println("element:" +ll);
  	  System.out.println();
  	  
  	  ll.add("a");
  	  ll.add("b");
  	  ll.add("10");
  	  ll.add("0.7");
  	  ll.add("s");
  	  ll.add("true");
  	  
	  System.out.println("Size:" +ll.size());
	  System.out.println("element:" +ll);
	  System.out.println();
	  
	  ll.add(11);
	  ll.add(null);
	  ll.add(null);
	  ll.add(new Example(50,100));
	  ll.add(new Example(50,100));
	    
	 
	  System.out.println("Size:" +ll.size());
	  System.out.println("element:" +ll);

  }
}