package com.odedia.springsession.rest;

import java.util.Arrays;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.session.data.redis.config.annotation.web.http.EnableRedisHttpSession;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.odedia.springsession.dto.Order;

@SpringBootApplication
@EnableDiscoveryClient
@EnableWebSecurity
@EnableRedisHttpSession
@RestController
public class RestApplication {

	public static void main(String[] args) {
		SpringApplication.run(RestApplication.class, args);
	}
	
	@GetMapping("/orders")
	public List<Order> getOrders() {
		
		return Arrays.asList(	new Order(1L, "David Cohen", 25.4F),
								new Order(2L, "Danny Smith", 30.3F),
								new Order(3L, "Amit Richardson", 40F)
							);
		
	}
}
