package com.chainsys.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.stereotype.Component;


public class AnnotationMain {
	public static void main(String[] args) {
		/*
		 * ApplicationContext applicationContext=new
		 * AnnotationConfigApplicationContext(AnnotationConfig.class); Employee2
		 * employee2=applicationContext.getBean(Employee2.class); Department1
		 * department1=applicationContext.getBean(Department1.class);
		 * System.out.println(department1.hashCode());
		 * employee2.getDepartment().getDeptId();
		 * 
		 * Ford ford=applicationContext.getBean(Ford.class);
		 * System.out.println(employee2.dbName);
		 */
		
		
		ApplicationContext beanFactory=new AnnotationConfigApplicationContext(BeanConfiguration.class);
		 Employee3 employee3=beanFactory.getBean(Employee3.class);
		 System.out.println(employee3.getClass().getName());
		 employee3.getStudent().getStudentId();
		 Department2 department2=beanFactory.getBean(Department2.class);
		 System.out.println(department2.hashCode());
		 System.out.println(employee3.getBank().getBankName());
		 System.out.println(employee3.url);
		 System.out.println(employee3.dbName);
	}

}
