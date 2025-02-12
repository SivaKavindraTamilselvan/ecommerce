package com.example.cart.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Builder;
import lombok.Data;
import lombok.Builder.Default;
import java.time.LocalDateTime;
import java.util.List;

@Data
@Builder
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Response {
    private int status;
    private String message;

    @Default
    private final LocalDateTime timestamp = LocalDateTime.now();  // ✅ Fix: Ensure builder supports final field

    private String token;
    private String role;
    private String expirationTime;

    private int totalPage;
    private long totalElement;

    private AddressDto address;
    private UserDto user;
    private List<UserDto> userList;

    private CategoryDto category;
    private List<CategoryDto> categoryList;

    private ProductDto product;
    private List<ProductDto> productList;

    private OrderItemsDto orderItem;
    private List<OrderItemsDto> orderItemList;

    private OrderDto order;
    private List<OrderDto> orderList;
}
