package com.question;

import java.util.ArrayList;
import java.util.Collections;
import java.util.TreeSet;

class MainClass {
	public static void main(String[] a) {
		
		TreeSet<Student> ts=new TreeSet<>(new sortByAge());  //sort TREE Set
		ts.add(new Student(25));    
		ts.add(new Student(15));
		ts.add(new Student(35));
		for(Student std:ts) {
		   System.out.println(std);
		}
		
		ArrayList<Student> lst=new ArrayList<>();
		lst.add(new Student(25));
		lst.add(new Student(15));
		lst.add(new Student(35));
		
		Collections.sort(lst,new sortByAge());  // Sort list.......
		  
		for(Student std:lst)
		{
			System.out.println(std);
		}
	}
}
