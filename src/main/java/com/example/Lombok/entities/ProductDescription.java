package com.example.Lombok.entities;

import lombok.*;

import javax.persistence.*;

@NoArgsConstructor
@Getter
@Setter
@Entity
public class ProductDescription {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String productType;

    @OneToOne(cascade = CascadeType.ALL)
    private Product product;


    public ProductDescription(String productType) {
    }
}
