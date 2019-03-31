package com.spring.integration.router;

import com.spring.integration.transport.Order;

public class ShippingRouter {
	
	public String route(Order order) {
		
		System.out.println("route : ShippingRouter");
		
		//Apply the logic here
		
		return "dhlChannel";
	}

}
