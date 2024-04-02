package com.ecommerce.shoppingcurd.service;

import com.ecommerce.shoppingcurd.entity.Product;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface ProductService {
    List<Product> getProducts();
}
