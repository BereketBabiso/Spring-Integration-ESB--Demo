package com.spring.integration.filter;

import org.springframework.stereotype.Component;

import com.spring.integration.transport.Order;

//@Component
public class OrderAmountFilter {
	
	public boolean filter(Order order) {
		System.out.println("Filter : OrderAmountFilter");
		if(null != order && order.getAmount() > 1) {
			return Boolean.TRUE;
		} else {
			return Boolean.FALSE;
		}
	}

}
