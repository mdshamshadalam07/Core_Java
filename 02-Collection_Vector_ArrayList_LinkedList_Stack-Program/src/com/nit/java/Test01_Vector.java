package com.nit.java;

import java.util.Vector;

public class Test01_Vector {
      public static void main(String args []) {
    	  
    	  Vector<Object> v = new Vector<>(); 
    	  System.out.println("Capacity:" + v.capacity());
    	  System.out.println("Size:" +v.size());
    	  System.out.println("element:" +v);
    	  System.out.println();
    	  
    	  v.add("a");
    	  v.add("b");
    	  v.add("10");
    	  v.add("0.7");
    	  v.add("s");
    	  v.add("true");
    	  v.add("a");
    	  v.add("10");
    	  v.add("0.7");
    	  v.add("s");
    	  v.add("true");
    	  
    	  System.out.println("Capacity:" + v.capacity());
    	  System.out.println("Size:" +v.size());
    	  System.out.println("element:" +v);
    	  System.out.println();
    	  
    	  v.add(11);
    	  v.add(null);
    	  v.add(new Example(50,100));
    	  v.add(new Example(50,100));
    	
    	    
    	  System.out.println("Capacity:" + v.capacity());
    	  System.out.println("Size:" +v.size());
    	  System.out.println("element:" +v);
      }
}
