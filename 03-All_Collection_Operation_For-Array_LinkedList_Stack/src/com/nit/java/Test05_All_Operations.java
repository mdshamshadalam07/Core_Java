package com.nit.java;

import java.util.ArrayList;

public class Test05_All_Operations {
	public static void main (String agrs []) {
		
		// Create Collection 
		ArrayList<Object> al=new ArrayList<Object>();
		
		// Counting and display elements
		       // Counting -> public int size()
               // Printing -> public String toString()		
		
		System.out.println("Size     :"+ al.size());
		System.out.println("Elements :"+ al);
		System.out.println();
		
		// Checking In Collection Empty
		System.out.println(al.isEmpty());
		System.out.println();
		
		// Adding all 4 Types of Objects
		      // public boolean add(object obj)
		
		  al.add("a");
	  	  al.add("b");
	  	  al.add("5");
	  	  al.add("6.7");
	  	  al.add("true");
	  	  al.add('b');
	  	  al.add("null");
	  	  al.add(new Example(5,6));
	  	  al.add("a");
	  	  al.add(5);
	  	  
	  	System.out.println("Size     :"+ al.size());
		System.out.println("Elements :"+ al);
		System.out.println(al.isEmpty());
		System.out.println();
		
		// Retrieving one Element on Collection
		      // public object get (int index) throws IOOBE 
		System.out.println(al.get(5));
		
		Object obj = al.get(5);
		System.out.println(obj);
		
		// Rules on the get() Methods
		// Character ch = al.get(5);                    // Rule #1:
		Object obj2 = al.get(5);                        // Rule #2:
		// Character ch = (Character)obj2;              // Rule #3:     Rule #4:
		
		if(obj2 instanceof Character) {                 // Rule #5: 
		Character ch = (Character)obj2;
		System.out.println(ch);	
		}
		
		// System.out.println(al.get(-1));              // Rule #6:
		// System.out.println(10);                      // Rule #7:
		
		// Limitation of get() Method
		System.out.println(3);
		System.out.println();
		
		// for (int i =0; i<=al.size(); i++) {          // Rule #8:
	    // for (int i =0; i<=al.size()-1; i++) {        // or
		// for (int i =0; i<al.size(); i++) {           // or
		for (int i =0; i<=al.size()-1; i++) {           // or   Last Elements missing
		     System.out.println(al.get(i));
		}
		
		System.out.println();
		
		// Display all String Objects in upper Case and remaining Elements as it is
		for (int i =0; i<al.size()-1; i++) { 
			Object obj3 = al.get(i);
			if(obj3 instanceof String) 
				System.out.println(((String)obj3).toUpperCase());
			else
				System.out.println(obj3);
			}
		
		System.out.println();
		
	   //Retrieving Object By using enhanced for loop / for each loop
		for(Object obj4 : al) {
		if(obj4 instanceof String) 
			System.out.println(((String)obj4).toUpperCase());
		else
			System.out.println(obj4);
		}
		
		// Searching an Object Collection
		       // Comparing the given argument with the Object Available Collection 
		             // If much Found ---> return true else return false
		
		// We Compare Objects in two Ways
		       // 1. By Using == operator is compare objects by using reference 
		       // 2. By Using equals () Methods is Compare objects by using either data or
		                                                        // by using reference
		
		// Public boolean Contains (Object obj)
		       // Inside Contains Method equals () method is called for comparison
		
		System.out.println(al.contains("a"));    // loop i1-> String.equals(String) -> true
		
		System.out.println(al.contains(5));      // loop i1-> io.equals("a")  -> false
		                                         // loop i2-> io.equals("b")  -> false
		                                         // loop i3-> io.equals(5)    -> true
		
		System.out.println(al.contains("A"));    // loop i1-> io.equals("a")  -> false
											     // loop i2-> io.equals("b")  -> false
											     // loop i3-> io.equals(5)    -> true
		
		System.out.println(al.contains('b'));    // loop i1-> co.equals("a")  -> false
											     // loop i2-> co.equals("b")  -> false
											     // loop i3-> co.equals(5)    -> false
												 // loop i4-> co.equals(6.7)  -> false
											     // loop i5-> co.equals(true) -> false
											     // loop i6-> co.equals('b')  -> true
	}	   	
}