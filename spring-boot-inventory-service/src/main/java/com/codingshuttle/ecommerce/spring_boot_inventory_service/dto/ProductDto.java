package com.codingshuttle.ecommerce.spring_boot_inventory_service.dto;

import lombok.Data;

@Data
public class ProductDto {
    private Long id;
    private String name;
    private Double price;
    private Integer stock;
}
