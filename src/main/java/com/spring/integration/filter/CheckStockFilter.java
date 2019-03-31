package com.spring.integration.filter;

import com.spring.integration.transport.Order;

public class CheckStockFilter {
	
	public boolean filter(Order order) {
		System.out.println(" Filter : CheckStockFilter");
		
		//Apply the logic here
		
		return Boolean.TRUE;
	}

}
