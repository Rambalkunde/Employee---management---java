package com.tka.jan12;

import java.util.ArrayList;
import java.util.List;

public class TestEmp {

	public static void main(String[] args) {
		
		List <Employee> emp = new ArrayList<>();
		
		emp.add(new Employee(101,"Ram","Developer",50000));
		emp.add(new Employee(102,"Aman","Tester",40000));
		emp.add(new Employee(103,"Aditya","Developer",45000));
		emp.add(new Employee(104,"karan","Tester",20000));
		emp.add(new Employee(105,"keshav","Developer",60000));
		
		System.out.println("Employee in company:---");
		
		for(Employee e : emp) {
			System.out.println("Employee id:-"+e.getEmp_id()+"Employee name:-"+e.getName()+"Employee role:-"+e.getRole()+"Employee salary:-"+e.getSalary());
		}
		
		//prints those role having tester
		System.out.println();
		System.out.println("Tester include");
		for(Employee e:emp) {
			if(e.getRole()=="Tester") {
				System.out.println(e.getName());
			}
		}
		
		System.out.println();
		System.out.println("Developer include");
		for(Employee e:emp) {
			if(e.getRole()=="Developer") {
				System.out.println(e.getName());
			}
		}
		//those employee having role above 20000
		
		System.out.println();
		System.out.println("Above salary 20000");
		for(Employee e : emp) {
			if(e.getSalary()>20000) {
				System.out.println(e.getName());
			}
		}
		
		
		/*System.out.println();
		System.out.println("20% add in salary amount");
		for(Employee e : emp) {
			if(e.getSalary()>20000);
			System.out.println(e.getName()+(e.getSalary()*0.2));
		}*/
		System.out.println();
		System.out.println("higest salary");
		Employee highs = emp.get(0);
		for(Employee  e:emp) {
			if(e.getSalary()>highs.getSalary()) {
				System.out.println(e.getName()+ "---->" +e.getSalary());
			}
		}
	}
	

}
