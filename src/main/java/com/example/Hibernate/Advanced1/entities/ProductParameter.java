package com.example.Hibernate.Advanced1.entities;

import javax.persistence.*;
import java.util.List;

@Entity
public class ProductParameter {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String madeByCountry;

    @OneToMany(cascade = {CascadeType.PERSIST,
            CascadeType.REFRESH, CascadeType.MERGE, CascadeType.DETACH})
    private List<Product> products;

    public ProductParameter(String madeByCountry) {
        this.madeByCountry = madeByCountry;
    }

    public ProductParameter() {

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getMadeByCountry() {
        return madeByCountry;
    }

    public void setMadeByCountry(String madeByCountry) {
        this.madeByCountry = madeByCountry;
    }

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }

    @Override
    public String toString() {
        return "ProductParameter{" +
                "madeByCountry='" + madeByCountry + '\'' +
                '}';
    }
}
