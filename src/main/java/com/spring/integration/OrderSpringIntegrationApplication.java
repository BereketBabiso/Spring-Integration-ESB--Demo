package com.spring.integration;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@ImportResource("classpath:integration.xml")
public class OrderSpringIntegrationApplication {

	public static void main(String[] args) {
		SpringApplication.run(OrderSpringIntegrationApplication.class, args);
	}

}
