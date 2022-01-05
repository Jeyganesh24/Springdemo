package com.chainsys.demo;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Component
public class Department {
	
	public Department() {
		System.out.println("Dept Called Using autowire");
	}
	private int deptId;
	private String deptName;
	public int getDeptId() {
		return deptId;
	}
	public void setDeptId(int deptId) {
		this.deptId = deptId;
	}
	public String getDeptName() {
		return deptName;
	}
	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}

}
