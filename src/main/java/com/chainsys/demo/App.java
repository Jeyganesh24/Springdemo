package com.chainsys.demo;

import java.lang.reflect.Constructor;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.FileSystemResource;

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
	BeanFactory beanFactory=new XmlBeanFactory(new FileSystemResource("spring.xml"));
		//ApplicationContext beanFactory=new ClassPathXmlApplicationContext("spring.xml");//Eager Init
	 Employee emp=(Employee) beanFactory.getBean("emp"); //Lazy Init
	 Employee emp1=(Employee)beanFactory.getBean("emp"); 
	 emp.getEmpName("Chainsys");
	  emp1.getEmpName("Test"); 
	  System.out.println(emp==emp1);
	 
	
	  try { 
		  Class c=Class.forName("com.chainsys.demo.Employee");
	  Constructor constructor[]= c.getDeclaredConstructors();
	  constructor[0].setAccessible(true); 
	  //constructor[0].newInstance("") ;
	  } catch
	  (ClassNotFoundException e) { // TODO Auto-generated catch block
	  e.printStackTrace(); }
	 
	 
	}
}
