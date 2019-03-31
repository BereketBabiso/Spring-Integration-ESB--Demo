package com.spring.integration.filter;

import com.spring.integration.transport.Order;

public class PaymentFilter {
	
	public boolean filter(Order order) {
		
		System.out.println("filter : PaymentFilter");
		
		//Apply the logic here
		
		return Boolean.TRUE;
	}

}
