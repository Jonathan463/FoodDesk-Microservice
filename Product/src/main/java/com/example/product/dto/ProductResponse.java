package com.example.product.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ProductResponse {
    private String name;
    private int size;
    private Double price;
    private String dateCreated;
    private String lastUpdatedDate;
}
