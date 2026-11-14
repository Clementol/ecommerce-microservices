package com.codingshuttle.ecommerce.spring_boot_inventory_service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class SpringBootInventoryServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootInventoryServiceApplication.class, args);
	}

}
