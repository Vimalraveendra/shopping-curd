package com.ecommerce.shoppingcurd.dto;

import jakarta.persistence.Column;
import lombok.Data;

import java.util.Date;

@Data
public class ProductDto {
    private String productName;
    private String brand;
    private String category;
    private double price;
    private String description;
    private String imageFileName;
}
