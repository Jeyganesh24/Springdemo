package com.chainsys.demo;

public class Department1 {
	
	public Department1() {
		System.out.println("Dept Object Created");
	}
	private String deptName;
	private int deptId;
	public String getDeptName() {
		return deptName;
	}
	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}
	public int getDeptId() {
		return deptId;
	}
	public void setDeptId(int deptId) {
		this.deptId = deptId;
	}

}
