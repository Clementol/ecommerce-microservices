package com.codingshuttle.ecommerce.spring_boot_inventory_service.repository;

import com.codingshuttle.ecommerce.spring_boot_inventory_service.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
