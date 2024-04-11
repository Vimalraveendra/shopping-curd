package com.ecommerce.shoppingcurd.controller;

import com.ecommerce.shoppingcurd.entity.Product;
import com.ecommerce.shoppingcurd.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/products")
public class ProductController {
    @Autowired
  private ProductService productService;
    @GetMapping("")
    public String getProducts(Model model){
        List<Product> products = productService.getProducts();
        model.addAttribute("products",products);
        return "products/index";
    }
}
