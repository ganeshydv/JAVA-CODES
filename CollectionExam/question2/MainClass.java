package com.question2;
import java.util.*;

class MainClass {
	public static void main(String [] a) {
		TreeMap<String,Employee > tmap=new TreeMap<>();
		tmap.put("tony", new Employee(101,23398));
		tmap.put("jerry", new Employee(102,45398));
		tmap.put("tom", new Employee(103,748498));
		
		Set<String> keys=tmap.keySet();
		ArrayList<Employee> lst=new ArrayList<>();
		
		for(String s:keys) {
			System.out.println(tmap.get(s));
			lst.add(tmap.get(s));
		}
		
		System.out.println("sort by id ........");
		Collections.sort(lst,new SortById());   //sort List....
		for(Employee e:lst) {
			System.out.println(e);
		}
		System.out.println("sort by salary ........");
		Collections.sort(lst,new SortBySalary());   //sort list......
		for(Employee e:lst) {
			System.out.println(e);
		}
		
	}
}
