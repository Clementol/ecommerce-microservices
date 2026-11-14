package com.codingshuttle.ecommerce.spring_boot_inventory_service.clients;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;

@FeignClient(name = "spring-boot-order-service", path = "/orders")
public interface OrdersFeignClient {
    @GetMapping("/core/helloOrders")
    String helloOrders(@RequestHeader("X-User-Id") String userId);
}
