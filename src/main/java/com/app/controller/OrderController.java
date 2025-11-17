package com.app.controller;

import com.app.dto.OrderDetails;
import com.app.entity.ProductDetails;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
public class OrderController {

    @PostMapping("/create")
    public String createOrder(@RequestBody OrderDetails orderDetails){

        System.out.println("order created for user "+orderDetails.getEmailId());

        return "order created with id:"+ UUID.randomUUID();

    }
    @GetMapping("/info/{orderID}")
    public OrderDetails getOrder(@PathVariable String orderId){
        System.out.println("Order Info on ID:"+orderId);
        return  new OrderDetails("yogjadhav151@gmail.com",List.of(new ProductDetails(1,"iphone",7000),new ProductDetails(3,"Airpod",300) ,new ProductDetails(2,"iwatch",800)),2000);
    }


}
