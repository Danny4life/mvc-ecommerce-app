package com.osiki.Ecommerceapp.service;

import com.osiki.Ecommerceapp.model.Product;

import java.util.List;

public interface ProductService {
    Product saveProducts(Product product);

    List<Product> getAllProducts();
}
