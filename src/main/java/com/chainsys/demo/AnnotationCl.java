package com.chainsys.demo;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class AnnotationCl{
	
private int id;
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	System.out.println("setter called with Id"+id);
	}

	public AnnotationCl() {
		System.out.println("Constructor Called");
	}
	
	public AnnotationCl(String name) {
		System.out.println("Constructor Called with name");
	}
	
	@PostConstruct
	public void initMetod() throws Exception {
		System.out.println("Init Called");
		
	}
	@PreDestroy
	public void destroyMethod() throws Exception {
		System.out.println("destroy Called");
		
	}

}
