package com.spring.integration.service;

import com.spring.integration.transport.Order;

public class FedexShippingService {
	
	public void handleRequest(Order order) {
		
		System.out.println("Order is shipped via FedEx");
		
		//Apply the logic here		
		
	}

}
