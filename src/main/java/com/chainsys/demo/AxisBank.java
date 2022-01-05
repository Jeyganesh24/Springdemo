package com.chainsys.demo;

import org.springframework.stereotype.Component;

@Component("Axis")
public class AxisBank implements Bank{

	@Override
	public String getBankName() {
		// TODO Auto-generated method stub
		return "AxisBank";
	}

}
