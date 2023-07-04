package com.osiki.Ecommerceapp.repository;

import com.osiki.Ecommerceapp.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
