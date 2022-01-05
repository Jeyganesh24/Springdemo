package com.chainsys.demo;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class Employee1 {
	
	private String employeeName;
	private int empId;
	private Department1 department1;
	private String[] empNameArray;
	private LinkedList<String> empNameList;
	
	private HashMap<String,String> map;
	
	public LinkedList<String> getEmpNameList() {
		return empNameList;
	}
	public void setEmpNameList(LinkedList<String> empNameList) {
		this.empNameList = empNameList;
	}

	private Department1[] department1Array;
	
	
	public Department1[] getDepartment1Array() {
		return department1Array;
	}
	public void setDepartment1Array(Department1[] department1Array) {
		this.department1Array = department1Array;
	}
	public String[] getEmpNameArray() {
		return empNameArray;
	}
	public void setEmpNameArray(String[] empNameArray) {
		this.empNameArray = empNameArray;
	}
	public Department1 getDepartment1() {
		return department1;
	}
	public void setDepartment1(Department1 department1) {
		this.department1 = department1;
	}
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public Employee1() {
		System.out.println("Employee1 Object");
	}
	public Employee1(String name) {
		System.out.println("Employee Name"+name);
	}
	public Employee1(int empId,String name,int deptId) {
		System.out.println("Employee Name"+name);
		System.out.println("Employee Id"+empId);
		System.out.println("dept Id"+deptId);
	}

	public void printData() {
		System.out.println("empId"+this.empId);
		System.out.println("employeeName"+this.employeeName);
		System.out.println("deptName"+this.department1.getDeptName());
		System.out.println("deptId"+this.department1.getDeptId());
		System.out.println("empNameArray"+this.empNameArray[1]);
		System.out.println("deptArrray"+this.department1Array[1].getDeptName());
		
		for (String empName : empNameList) {
			System.out.println(empName);
		}
		for (Entry<String, String> entry : map.entrySet()) {
			System.out.println("Map"+entry.getValue());
		}
		
	}
	public HashMap<String, String> getMap() {
		return map;
	}
	public void setMap(HashMap<String, String> map) {
		this.map = map;
	}
}
