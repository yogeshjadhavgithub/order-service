package com.app.dto;

import com.app.entity.ProductDetails;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class OrderDetails {

    private String emailId;
    private List<ProductDetails> OrderedItems;
    private double totalAmount;


}
