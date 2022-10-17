package com.question2;

class Employee {
	private int id;
	private Double salary;
	Employee(int id, double salary){
		this.id=id;
		this.salary=salary;
	}
	public int getId() {
		return id;
	}
	public Double getSalary() {
		return salary;
	}
	@Override
	public String toString() {
		return "id: "+id+" salary: "+salary;
	}
	
	
	
}
