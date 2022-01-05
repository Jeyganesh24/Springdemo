package com.chainsys.demo;

import org.springframework.stereotype.Component;

@Component("Hdfc")
public class HdfcBank implements Bank{

	@Override
	public String getBankName() {
		// TODO Auto-generated method stub
		return "Hdfc Bank";
	}

}
