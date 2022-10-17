package com.question;

class Student {
	private int age;
	Student(int age){
		this.age=age;
	}

	public int getAge(){
		return age;
	}

	public String toString(){
		return "age is: "+age;
	}

}
