package com.example.Lombok.controller;

import com.example.Lombok.entities.Product;
import com.example.Lombok.service.ProductServiceImpl;
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
