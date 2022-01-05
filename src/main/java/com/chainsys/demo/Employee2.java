package com.chainsys.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;

public class Employee2 {

	@Autowired
	public Department department;
	
	@Value("${db}")
	public String dbName;
	
	@Autowired
	@Qualifier("Ford")
	public Car car;
	
	public Employee2() {
		System.out.println("Employee2 instance created");
	}
	public Employee2(Department1 department1) {
		System.out.println("myBean hashcode = "+department1.hashCode());
		System.out.println("Employee2 instance created for dept");
	}
	public Department getDepartment() {
		return department;
	}
	public void setDepartment(Department department) {
		this.department = department;
	}
	
	
}
