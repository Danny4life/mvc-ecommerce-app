package com.osiki.Ecommerceapp.service.impl;

import com.osiki.Ecommerceapp.model.Product;
import com.osiki.Ecommerceapp.repository.ProductRepository;
import com.osiki.Ecommerceapp.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductRepository productRepository;

    public ProductServiceImpl(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @Override
    public Product saveProducts(Product product) {
        return productRepository.save(product);
    }
}
