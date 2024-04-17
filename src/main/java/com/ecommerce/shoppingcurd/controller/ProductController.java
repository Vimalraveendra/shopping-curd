package com.ecommerce.shoppingcurd.controller;

import com.ecommerce.shoppingcurd.dto.ProductDto;
import com.ecommerce.shoppingcurd.entity.Product;
import com.ecommerce.shoppingcurd.service.ProductService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
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

    @GetMapping("/create")
    public String showCreatePage(Model model){
        ProductDto productDto = new ProductDto();
        model.addAttribute("productDto",productDto);
        return "products/createProduct";
    }
    @PostMapping("/create")
    public String createProduct(@Valid @ModelAttribute ProductDto productDto,
    BindingResult result){
        if(productDto.getImageFile().isEmpty()){
            result.addError(new FieldError("productDto","imageFile","The image file is required"));
        }

        if(result.hasErrors()){
            return "products/createProduct";
        }
       return "redirect/products";
    }
}
