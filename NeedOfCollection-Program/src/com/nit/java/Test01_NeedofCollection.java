package com.nit.java;

public class Test01_NeedofCollection {
	public static void main(String arg[]) {
	
	Student s1= new Student(101,"Shamshad","Core Java",1000);
	Student s2= new Student(102,"Sanjay","Java",2000);
	Student s3= new Student(103,"Rani","Core Java",3000);
	Student s4= new Student(104,"Shilendra","Core Java",4000);
	Student s5= new Student(105,"Luckey","Core Java",5000);
	Student s6= new Student(106,"Gulam","Core Java",6000);
	Student s7= new Student(107,"Nanand","Core Java",7000);
	Student s8= new Student(108,"Manish","Core Java",8000);
	Student s9= new Student(109,"Rahi","Core Java",9000);
	Student s10= new Student(110,"Preeti","Core Java",10000);
	Student s11= new Student(111,"Zamal","Core Java",1100);
	Student s12= new Student(112,"Manoj","Core Java",1200);
	Student s13= new Student(113,"Gopal","Core Java",13000);
	
	System.out.println(s1);
	System.out.println(s2);
	System.out.println(s3);
	System.out.println(s4);
	System.out.println(s5);
	System.out.println(s6);
	System.out.println(s7);
	System.out.println(s8);
	System.out.println(s9);
	System.out.println(s10);
	System.out.println(s11);
	System.out.println(s12);
	System.out.println(s13);
	
	Faculty f1 = new Faculty();
	
	College clg=new College();
	
	clg.join(s1);
	clg.join(s2);
	clg.join(s3);
	clg.join(s4);
	clg.join(s5);
	clg.join(s6);
	clg.join(s7);
	clg.join(s8);
	clg.join(s9);
	clg.join(s10);
	clg.join(s11);
	clg.join(s12);
	clg.join(s13);
	
	clg.join(f1);
	
	System.out.println();
	clg.display();

  }
}
