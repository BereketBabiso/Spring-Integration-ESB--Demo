package com.spring.integration.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.Message;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.spring.integration.gatway.OrderGateway;
import com.spring.integration.transport.Order;

@RestController
public class OrderController {
	
	@Autowired OrderGateway orderGateway;
	
	@PostMapping("/order")
	public String placeOrder(@RequestBody Order order) {
		System.out.println("order received");
		Message<Order> orderMsg = MessageBuilder.withPayload(order).build();
		
		orderGateway.handleRequest(orderMsg);
		
		return "Success";
	}

}
