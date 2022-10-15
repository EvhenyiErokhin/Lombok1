package com.example.Lombok.repository;

import com.example.Lombok.entities.Product;
import org.springframework.data.repository.CrudRepository;

public  interface ProductRepository extends CrudRepository<Product,Long> {
}
