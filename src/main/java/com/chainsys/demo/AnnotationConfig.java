package com.chainsys.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan
@PropertySource("classpath:resources/driver.properties")
public class AnnotationConfig {
	
	@Bean
    public Employee2 myEmployee() {
		return new Employee2(myDept());
	}
	
	@Bean
    public Department1 myDept() {
		return new Department1();
	}
	
	
	
	

}
