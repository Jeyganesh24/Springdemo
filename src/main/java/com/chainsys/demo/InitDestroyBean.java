package com.chainsys.demo;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class InitDestroyBean implements ApplicationContextAware,BeanNameAware,BeanFactoryAware, InitializingBean,DisposableBean {

	private int id;
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	System.out.println("setter called with Id"+id);
	}

	public InitDestroyBean() {
		System.out.println("Constructor Called");
	}
	
	public InitDestroyBean(String name) {
		System.out.println("Constructor Called with name");
	}
	
	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("Init Called");
		
	}
	
	@Override
	public void destroy() throws Exception {
		System.out.println("destroy Called");
		
	}

	@Override
	public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
		System.out.println("BeanFactoryAware"+beanFactory.getBean("init"));
		
	}

	@Override
	public void setBeanName(String name) {
		System.out.println("BeanNameAware"+name);
		
	}

	@Override
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		System.out.println("ApplicationContextAware"+applicationContext.getApplicationName());
		
	}
	

}
