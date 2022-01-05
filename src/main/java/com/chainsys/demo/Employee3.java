package com.chainsys.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;

public class Employee3 {

	private int empId;
	private String empName;
	
	@Autowired
	private Student student;
	
	@Autowired
	@Qualifier("Axis")
	private Bank bank;
	
	@Value("${db}")
	public String dbName;
	
	@Value("${url}")
	public String url;
	
	public Bank getBank() {
		return bank;
	}

	public void setBank(Bank bank) {
		this.bank = bank;
	}

	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public Employee3() {
		System.out.println("Employee 3 Object Created");
	}
	public Employee3(Department2 department2) {
		System.out.println(department2.hashCode());
	}
	
	
}
