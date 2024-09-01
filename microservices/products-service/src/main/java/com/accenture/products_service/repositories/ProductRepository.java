package com.accenture.products_service.repositories;

import com.accenture.products_service.model.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
