package com.spring.integration.service;

import com.spring.integration.transport.Order;

public class DhlShippingService {
	
	public void handleRequest(Order order) {
		
		System.out.println("Order is shipped via DHL");
		
		//Apply the logic here		
		
	}

}
