package com.ecommerce.shoppingcurd.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="Products")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long productId;
    private String productName;
    private String brand;
    private String category;
    private double price;
    @Column(columnDefinition = "TEXT")
    private String description;
    private Date createdAt;
    private String imageFileName;
}
