package com.chainsys.demo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan
@PropertySource("classpath:resources/driver.properties")
public class BeanConfiguration {

	@Bean
	public Employee3 getEmployee() {
		return new Employee3(getDept());
	}
	
	@Bean
	public Department2 getDept() {
		return new Department2();
	}
}
