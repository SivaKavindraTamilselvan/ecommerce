package com.example.cart.dto;

import lombok.Data;

@Data
public class OrderItemsRequest {
    private Long productId;
    private int quantity;
}
