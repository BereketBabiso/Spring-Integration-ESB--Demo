package com.spring.integration.gatway;

import org.springframework.integration.annotation.Gateway;
import org.springframework.integration.annotation.MessagingGateway;
import org.springframework.messaging.Message;

import com.spring.integration.transport.Order;

@MessagingGateway
public interface DhltGateway {
	
	@Gateway(requestChannel = "dhlChannel")
	public Order handleRequest(Message<Order> orderMsg);

}
