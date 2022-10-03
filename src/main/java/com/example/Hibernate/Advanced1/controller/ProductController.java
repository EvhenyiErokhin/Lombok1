package com.example.Hibernate.Advanced1.controller;

import com.example.Hibernate.Advanced1.entities.Product;
import com.example.Hibernate.Advanced1.service.ProductServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {
    private ProductServiceImpl productService;

    @Autowired
    public ProductController(ProductServiceImpl productService) {
        this.productService = productService;
    }


    @PostMapping("/products")
    public Product saveProduct(@RequestBody Product product) {
        productService.save(product);
        return product;
    }

    @GetMapping("/products")
    public Iterable<Product> getProducts() {
        return productService.getAll();
    }

}
