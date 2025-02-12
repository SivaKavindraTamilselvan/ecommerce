package com.example.cart.entity;

import jakarta.persistence.*;
import lombok.Data;
import org.springframework.boot.autoconfigure.condition.ConditionalOnBean;

import java.time.LocalDateTime;
import java.util.List;

@Data
@Entity
@Table(name="category")
public class Category {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(unique = true)
    private String name;

    @OneToMany(mappedBy = "category" ,fetch = FetchType.LAZY,cascade = CascadeType.ALL)
    private List<Product> productList;

    @Column(name = "created_at")
    private final LocalDateTime createdAt = LocalDateTime.now();
}
