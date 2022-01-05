package com.chainsys.demo;

public class Declaritive {

private int id;
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	System.out.println("setter called with Id"+id);
	}

	public Declaritive() {
		System.out.println("Constructor Called");
	}
	
	public Declaritive(String name) {
		System.out.println("Constructor Called with name");
	}
	
	public void initMetod() throws Exception {
		System.out.println("Init Called");
		
	}
	
	public void destroyMethod() throws Exception {
		System.out.println("destroy Called");
		
	}
}
