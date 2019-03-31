package com.spring.integration.gatway;

import org.springframework.integration.annotation.Gateway;
import org.springframework.integration.annotation.MessagingGateway;
import org.springframework.messaging.Message;

import com.spring.integration.transport.Order;

@MessagingGateway
public interface RejectOrderGateway {
	
	@Gateway(requestChannel= "rejectorderChannel")
	public Order handleRequest(Message<Order> orderMsg);

}
