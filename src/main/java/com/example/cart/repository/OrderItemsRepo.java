package com.example.cart.repository;

import com.example.cart.entity.OrderItems;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderItemsRepo extends JpaRepository<OrderItems,Long> {
    Page<OrderItems> findAll(Specification<OrderItems> spec, Pageable pageable);
}
