package com.StudentQuestion;

import java.util.Comparator;

class SortByAge implements Comparator<Student> {
	
		public int compare(Student s1, Student s2) {
			return s1.getAge()-s2.getAge();
		}
}
