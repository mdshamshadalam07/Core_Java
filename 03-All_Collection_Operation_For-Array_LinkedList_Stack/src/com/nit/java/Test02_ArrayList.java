package com.nit.java;

import java.util.ArrayList;

public class Test02_ArrayList {
	public static void main(String args []) {
		
	  ArrayList <Object> al = new ArrayList<>();
  	  System.out.println("Size:" +al.size());
  	  System.out.println("element:" +al);
  	  System.out.println();
  	  
  	  al.add("a");
  	  al.add("b");
  	  al.add("10");
  	  al.add("0.7");
  	  al.add("s");
  	  al.add("true");
  	  al.add("a");
  	  al.add("10");
  	  al.add("0.7");
  	  al.add("s");
  	  al.add("true");
  	  
	  System.out.println("Size:" +al.size());
	  System.out.println("element:" +al);
	  System.out.println();
	  
	  al.add(11);
	  al.add(null);
	  al.add(new Example(50,100));
	  al.add(new Example(50,100));
	    
	 
	  System.out.println("Size:" +al.size());
	  System.out.println("element:" +al);
	}

}
