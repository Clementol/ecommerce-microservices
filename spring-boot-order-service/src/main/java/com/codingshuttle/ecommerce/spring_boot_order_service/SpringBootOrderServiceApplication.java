package com.codingshuttle.ecommerce.spring_boot_order_service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class SpringBootOrderServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootOrderServiceApplication.class, args);
	}

}
