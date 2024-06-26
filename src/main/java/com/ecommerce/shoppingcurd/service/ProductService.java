package com.ecommerce.shoppingcurd.service;

import com.ecommerce.shoppingcurd.entity.Product;
import org.springframework.stereotype.Service;

import java.util.List;

public interface ProductService {
    List<Product> getProducts();
    Product saveProduct(Product product);
    Product getProductById(Long id);
    void updateProduct(Product product);
    void deleteProduct(Long id);
}
