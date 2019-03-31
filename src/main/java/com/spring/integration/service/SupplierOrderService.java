package com.spring.integration.service;

import com.spring.integration.transport.Order;

public class SupplierOrderService {
	
	public void handleRequest(Order order) {
		
		System.out.println("the product is out of stock, making supplier order request");
	}

}
