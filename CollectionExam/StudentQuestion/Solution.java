package com.StudentQuestion;

import java.util.*;

class Solution {

	public static void main(String[] args) {
		Student s1=new Student(103, "x", 22, 67);
		Student s2=new Student(102, "b", 24, 57);
		Student s3=new Student(101, "c", 25, 87);
		LinkedHashMap<Integer,Student> lmap = new LinkedHashMap<Integer, Student>();
		lmap.put(s1.getId(),s1);
		lmap.put(s2.getId(),s2);
		lmap.put(s3.getId(),s3);
		Set<Integer> keys=lmap.keySet();
		
		ArrayList<Student> lst=new ArrayList<Student>();
//		TreeSet<Student> ts=new TreeSet<Student>(new SortByName());
		
		//--------Insert Obj in TreeSet And ArrayList-----------------------
		for(Integer id:keys) {
			System.out.println(lmap.get(id));
//			ts.add(lmap.get(id));
			lst.add(lmap.get(id));
		}
		
		//-----------------TreeSet-------------------------------
//		System.out.println("Sort by Name using treeSet");
//		for(Student s:ts) {
//			System.out.println(s);
//		}
		//-----------------------Lists--------------------------
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter \n1)Sort by Id \n 2)Sort by Name \n 3)Sort by marks \n 4)Sort by age");
		int a=sc.nextInt();
		if(a==1) {
			Collections.sort(lst,new SortById());
			System.out.println("Sort by id using ArrayList");
		}else if(a==2) {
			Collections.sort(lst,new SortByName());
			System.out.println("Sort by Name using ArrayList");
		}else if(a==3) {
			Collections.sort(lst,new SortByMarks());
			System.out.println("Sort by Marks using ArrayList");
		}else {
			Collections.sort(lst,new SortByAge());
			System.out.println("Sort by age using ArrayList");
		}
//		Collections.sort(lst,new SortById());
		//sort using arrayList
		for(Student s:lst) {
			System.out.println(s);
		}
		sc.close();

	}

}
