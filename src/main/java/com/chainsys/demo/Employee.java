package com.chainsys.demo;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map.Entry;

public class Employee {
	
private int empId;
private String empName;
private int deptId;

private Department department;
private String[] empNameArray;
private Department[] departments;

private List<String> empNameList;

private LinkedList<Department> empNameLinkedList;

private HashMap<String, Department> hashMap;

private LinkedList<Department> empNameLinkedList1;

private HashMap<String, Department> hashMap1;

	
	public LinkedList<Department> getEmpNameLinkedList1() {
	return empNameLinkedList1;
}
public void setEmpNameLinkedList1(LinkedList<Department> empNameLinkedList1) {
	this.empNameLinkedList1 = empNameLinkedList1;
}
public HashMap<String, Department> getHashMap1() {
	return hashMap1;
}
public void setHashMap1(HashMap<String, Department> hashMap1) {
	this.hashMap1 = hashMap1;
}
	public LinkedList<Department> getEmpNameLinkedList() {
	return empNameLinkedList;
}
public void setEmpNameLinkedList(LinkedList<Department> empNameLinkedList) {
	this.empNameLinkedList = empNameLinkedList;
}
	public HashMap<String, Department> getHashMap() {
	return hashMap;
}
public void setHashMap(HashMap<String, Department> hashMap) {
	this.hashMap = hashMap;
}
	public List<String> getEmpNameList() {
	return empNameList;
}
public void setEmpNameList(List<String> empNameList) {
	this.empNameList = empNameList;
}
	public Department[] getDepartments() {
	return departments;
}
public void setDepartments(Department[] departments) {
	this.departments = departments;
}
	public int getEmpId() {
	return empId;
}
public Department getDepartment() {
		return department;
	}
	public void setDepartment(Department department) {
		this.department = department;
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
public int getDeptId() {
	return deptId;
}
public void setDeptId(int deptId) {
	this.deptId = deptId;
}
	public Employee (String name) {
		System.out.println(name);
	}
	public Employee (String name,int age) {
		System.out.println(name);
		System.out.println(age);
	}
	public Employee (String name,int age,String email) {
		System.out.println(name);
		System.out.println(age);
		System.out.println(email);
	}
	
	public void getEmpName(String empName) {
		System.out.println("Emp Name is"+empName );
		
	}
	public void getEmpDetails() {
		System.out.println("Emp Name is"+this.empName );
		System.out.println("Emp Id is"+this.empId );
		System.out.println("Dept Id is"+this.deptId );
	//	System.out.println("Dept"+department.getDeptId());
	//	System.out.println("Dept"+department.getDeptName());
	//	System.out.println(empNameArray[1]);
	//	System.out.println("deptArray"+departments[0].getDeptId());
	//	System.out.println("deptArray"+departments[1].getDeptId());
		
		for (Department dept : empNameLinkedList) {
			System.out.println("name"+dept.getDeptId());
		}
		for (Entry<String, Department> entry : hashMap.entrySet()) {
			System.out.println("Map"+entry.getValue().getDeptId());
		}
		
		
		for (Department dept : empNameLinkedList1) {
			System.out.println("empNameLinkedList1"+dept.getDeptId());
		}
		for (Entry<String, Department> entry : hashMap1.entrySet()) {
			System.out.println("hashMap1"+entry.getValue().getDeptId());
		}
		
	}
	public String[] getEmpNameArray() {
		return empNameArray;
	}
	public void setEmpNameArray(String[] empNameArray) {
		this.empNameArray = empNameArray;
	}

}
