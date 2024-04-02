package com.ecommerce.shoppingcurd.controller;

import com.ecommerce.shoppingcurd.entity.Product;
import com.ecommerce.shoppingcurd.service.ProductService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/products")
public class ProductController {
  private ProductService productService;
    public String getProducts(Model model){
        List<Product> products = productService.getProducts();
        model.addAttribute("products",products);
        return "products/index";
    }
}
