package com.chainsys.demo;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.stereotype.Component;

@Component("Ford")
public class Ford implements Car {

	
	@Override
	public String getCarName() {
		// TODO Auto-generated method stub
		return "Ford cars";
	}

}
