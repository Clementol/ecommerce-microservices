package com.codingshuttle.ecommerce.spring_boot_order_service.clients;

import com.codingshuttle.ecommerce.spring_boot_order_service.dto.OrderRequestDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

@FeignClient(name = "spring-boot-inventory-service", path = "/inventory")
public interface InventoryOpenFeignClient {

    @PutMapping("/products/reduce-stock")
    Double reduceStocks(@RequestBody OrderRequestDto orderRequestDto);
}
