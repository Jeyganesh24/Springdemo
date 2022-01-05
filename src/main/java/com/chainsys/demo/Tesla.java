package com.chainsys.demo;

import org.springframework.stereotype.Component;

@Component("Tesla")
public class Tesla implements Car{

	@Override
	public String getCarName() {
		// TODO Auto-generated method stub
		return "Electric Car";
	}

}
