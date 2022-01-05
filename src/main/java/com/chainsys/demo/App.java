package com.chainsys.demo;

import java.lang.reflect.Constructor;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.CommonAnnotationBeanPostProcessor;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
	/*
	 * public static void main( String[] args ) { System.out.println( "Hello World!"
	 * ); BeanFactory beanFactory=new XmlBeanFactory(new
	 * FileSystemResource("spring.xml")); // ApplicationContext beanFactory=new
	 * ClassPathXmlApplicationContext("spring.xml"); Employee employee=(Employee)
	 * beanFactory.getBean("emp"); employee.getEmpName("Jey");
	 * 
	 * 
	 * 
	 * }
	 */
	
	public static void main(String[] args) {
	//BeanFactory beanFactory=new XmlBeanFactory(new FileSystemResource("spring.xml"));
		String files[]=new String[]{"resources/spring6.xml"};
		ApplicationContext beanFactory=new ClassPathXmlApplicationContext(files);//Eager Init
		ProgrmaticInit init=(ProgrmaticInit) beanFactory.getBean("init"); //Lazy Init
System.out.println("Getter Id"+init.getId());
((AbstractApplicationContext) beanFactory).registerShutdownHook();

		//BeanPostProcess post=(BeanPostProcess) beanFactory.getBean("post");
//System.out.println("beangetter"+emp.getId());
//((AbstractApplicationContext) beanFactory).registerShutdownHook();
	// emp.printData();
	//emp.getEmpDetails();
	 
	
		/*
		 * try { Class c=Class.forName("com.chainsys.demo.Employee"); Constructor
		 * constructor[]= c.getDeclaredConstructors();
		 * constructor[0].setAccessible(true); //constructor[0].newInstance("") ; }
		 * catch (ClassNotFoundException e) { // TODO Auto-generated catch block
		 * e.printStackTrace(); }
		 */
	 
	}
}
