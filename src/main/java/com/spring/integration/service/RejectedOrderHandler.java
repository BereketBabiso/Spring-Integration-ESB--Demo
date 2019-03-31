package com.spring.integration.service;

import com.spring.integration.transport.Order;

public class RejectedOrderHandler {
	
	public void handleRequest(Order order) {
		
		System.out.println("Order rejected due to min amount cretaria");
	}

}
