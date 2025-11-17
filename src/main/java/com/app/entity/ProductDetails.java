package com.app.entity;

import jakarta.persistence.Entity;
import lombok.*;

//@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
@Getter
@Setter
public class ProductDetails {

    private Integer id;
    private String productName;
    private double price;
}
