package com.StudentQuestion;

class Student {
	private int id;
	private String name;
	private int marks;
	private int age;
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public int getMarks() {
		return marks;
	}
	public int getAge() {
		return age;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Student(int id, String name, int marks, int age) {
		super();
		this.id = id;
		this.name = name;
		this.marks = marks;
		this.age = age;
	}
	public String toString() {
		return "id: "+id+" name: "+name+" age: "+age+" marks: "+marks;
	}
	
}
