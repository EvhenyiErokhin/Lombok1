package com.example.Hibernate.Advanced1.service;

import com.example.Hibernate.Advanced1.repository.ProductRepository;
import com.example.Hibernate.Advanced1.entities.Product;
import com.example.Hibernate.Advanced1.entities.ProductDescription;
import com.example.Hibernate.Advanced1.entities.ProductParameter;
import com.example.Hibernate.Advanced1.entities.Category;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.math.BigDecimal;
import java.util.Arrays;

@Service
public class ProductServiceImpl implements ProductService {

    private ProductRepository productRepository;

    @Autowired
    public ProductServiceImpl(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @PostConstruct
    void init() {
        Product product1 = new Product("chair", new BigDecimal(1500));
        Product product2 = new Product("armchair", new BigDecimal(2500));
        Product product3 = new Product("couch", new BigDecimal(7500));


        Category category1 = new Category("small");
        Category category2 = new Category("normal");
        Category category3 = new Category("large");


        ProductParameter productParameter1 = new ProductParameter("Ukraine");
        ProductParameter productParameter2 = new ProductParameter("China");
        ProductParameter productParameter3 = new ProductParameter("Poland");


        ProductDescription productDescription1 = new ProductDescription("kitchen");
        ProductDescription productDescription2 = new ProductDescription("office");
        ProductDescription productDescription3 = new ProductDescription("living room");

        product1.setProductDescription(productDescription1);
        product1.setProductParameter(productParameter1);
        product1.setCategory(Arrays.asList(category2, category3, category1));

        product2.setProductDescription(productDescription2);
        product2.setProductParameter(productParameter2);
        product2.setCategory(Arrays.asList(category2, category1, category2));

        product3.setProductDescription(productDescription3);
        product3.setProductParameter(productParameter3);
        product3.setCategory(Arrays.asList(category2, category3));


        productRepository.saveAll(Arrays.asList(product1, product2, product3));
    }

    @Override
    public Iterable<Product> getAll() {
        return productRepository.findAll();
    }

    @Override
    public Product save(Product product) {
        productRepository.save(product);
        return product;
    }
}
