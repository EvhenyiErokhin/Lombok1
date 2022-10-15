package com.example.Lombok.service;

import com.example.Lombok.entities.Product;

public interface ProductService {
    Iterable<Product> getAll();
    Product save(Product book) throws NoSuchMethodException;

}
