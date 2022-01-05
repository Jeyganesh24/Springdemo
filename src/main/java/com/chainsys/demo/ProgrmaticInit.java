package com.chainsys.demo;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;


public class ProgrmaticInit{
	
	private int id;
	
	public ProgrmaticInit() {
		System.out.println("ProgrmaticInit Called");
	}
	public ProgrmaticInit(String name) {
		System.out.println("ProgrmaticInit Called"+name);
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
		System.out.println("Id"+id);
	}
		
	

}
