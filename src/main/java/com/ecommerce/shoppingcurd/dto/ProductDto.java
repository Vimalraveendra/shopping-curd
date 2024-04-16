package com.ecommerce.shoppingcurd.dto;

import jakarta.persistence.Column;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;
import lombok.Data;
import org.springframework.web.multipart.MultipartFile;

import java.util.Date;

@Data
public class ProductDto {
    @NotEmpty(message = "The product name is required")
    private String productName;
    @NotEmpty(message = "The brand is required")
    private String brand;
    @NotEmpty(message ="The category name is required" )
    private String category;
    @Min(0)
    private double price;
    @Size(min=10,message ="The description should be at least 10 characters")
    @Size(max = 2000,message = "The description should not exceed 2000 characters")
    private String description;
    private MultipartFile imageFile;

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public MultipartFile getImageFile() {
        return imageFile;
    }

    public void setImageFile(MultipartFile imageFile) {
        this.imageFile = imageFile;
    }
}
