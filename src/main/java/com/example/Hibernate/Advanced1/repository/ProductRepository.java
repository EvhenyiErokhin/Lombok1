package com.example.Hibernate.Advanced1.repository;

import com.example.Hibernate.Advanced1.entities.Product;
import org.springframework.data.repository.CrudRepository;

public  interface ProductRepository extends CrudRepository<Product,Long> {
}
