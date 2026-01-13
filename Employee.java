package com.tka.jan12;

public class Employee {
	
	private int emp_id;
	private String name;
	private String role;
	private double salary;
	
	Employee(){
		
	}

	public Employee(int emp_id, String name, String role, double salary) {
		super();
		this.emp_id = emp_id;
		this.name = name;
		this.role = role;
		this.salary = salary;
	}

	public int getEmp_id() {
		return emp_id;
	}

	public void setEmp_id(int emp_id) {
		this.emp_id = emp_id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	
	

}
