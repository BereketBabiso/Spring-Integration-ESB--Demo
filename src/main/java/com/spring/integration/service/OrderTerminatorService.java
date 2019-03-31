package com.spring.integration.service;

import com.spring.integration.transport.Order;

public class OrderTerminatorService {
	
	public void handleRequest(Order order) {
		
		System.out.println("This service stops the order processing.");
	}

}
