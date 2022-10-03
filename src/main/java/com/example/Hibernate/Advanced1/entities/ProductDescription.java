package com.example.Hibernate.Advanced1.entities;

import javax.persistence.*;

@Entity
public class ProductDescription {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String productType;

    @OneToOne(cascade = CascadeType.ALL)
    private Product product;

    public ProductDescription(String productType) {
        this.productType = productType;
    }

    public ProductDescription() {

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getProductType() {
        return productType;
    }

    public void setProductType(String productType) {
        this.productType = productType;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    @Override
    public String toString() {
        return "ProductDescription{" +
                "id=" + id +
                ", productType='" + productType + '\'' +
                ", product=" + product +
                '}';
    }
}
