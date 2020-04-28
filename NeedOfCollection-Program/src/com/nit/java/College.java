package com.nit.java;

import java.util.ArrayList;

public class College {
	
	// private Student [] sa;
	 //private int index;
	
	ArrayList <Student> al1;
	//ArrayList <Faculty> al2;
	
	public College () {
		//sa=new Student[5];
		al1=new ArrayList();
	}
		
	public void join(Student s) {
		//this.sa[index]=s;
		//index ++;
		al1.add(s);
	}
	
	public void join(Faculty f) {
		//this.sa[index]=s;
		//index ++;
	//	al2.add(f);
	}
	
	public void display() {
		for (int i =0; i < al1.size(); i++) {
		System.out.println(al1.get(i));
		}
  }
}