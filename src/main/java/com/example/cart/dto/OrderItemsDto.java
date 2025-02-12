package com.example.cart.dto;

import com.example.cart.entity.Order;
import com.example.cart.entity.Product;
import com.example.cart.enums.OrderStatus;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import jakarta.persistence.Column;
import jakarta.persistence.FetchType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
@AllArgsConstructor
@NoArgsConstructor
public class OrderItemsDto {
    private Long id;
    private int quantity;
    private BigDecimal price;
    private String status;
    private  UserDto user;
    private ProductDto product;
    private OrderDto order;
    private LocalDateTime createdAt;
}
