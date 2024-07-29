package com.example.product.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name ="Product")
public class Product {
    @Id
    private Long id;
    private String name;
    private Double price;
    private int size;
    private String dateCreated;
    private String dateUpdated;
}
