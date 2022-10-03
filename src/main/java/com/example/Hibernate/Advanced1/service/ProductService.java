package com.example.Hibernate.Advanced1.service;

import com.example.Hibernate.Advanced1.entities.Product;

public interface ProductService {
    Iterable<Product> getAll();
    Product save(Product book) throws NoSuchMethodException;

}
