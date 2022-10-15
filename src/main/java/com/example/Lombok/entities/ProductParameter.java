package com.example.Lombok.entities;

import lombok.*;

import javax.persistence.*;
import java.util.List;

@Getter
@Setter
@Entity
@NoArgsConstructor
public class ProductParameter {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String madeByCountry;

    @OneToMany(cascade = {CascadeType.PERSIST,
            CascadeType.REFRESH, CascadeType.MERGE, CascadeType.DETACH})
    private List<Product> products;


    public ProductParameter(String madeByCountry) {
    }
}
