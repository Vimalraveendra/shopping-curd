package com.ecommerce.shoppingcurd.config;

import com.ecommerce.shoppingcurd.entity.Product;
import com.ecommerce.shoppingcurd.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Date;
import java.util.List;

@Configuration
public class ProductConfig {
  @Autowired
    private ProductRepository productRepository;
    @Bean
    CommandLineRunner commandLineRunner(ProductRepository repository) {
        return args -> {
            Product Apple = new Product(
                    null,
                    "mac",
                    "mac book",
                    "laptop",
                    5000.00,
                    "One of the most widely used laptop",
                    new Date(),
                    "avatar-161325_640.png"

            );
            Product Samsung = new Product(
                    null,
                    "samsung",
                    "s20",
                    "phone",
                    1200.00,
                    "One of fatest selling phone",
                    new Date(),
                    "avatar-2027366_640.png"

            );
            Product Watch = new Product(
                    null,
                    "watch",
                    "mac-watch",
                    "I8",
                    1000.00,
                    "The latest model of mac smart watch",
                    new Date(),
                    "avatar-2109804_640.png"
            );
            Product Headset = new Product(
                    null,
                    "headset",
                    "JBL",
                    "e55bt",
                    500.00,
                    "one of the commonly used headset", new Date(),
                    "avatar-3637425_640.png"
            );

            repository.saveAll(List.of(Apple, Samsung, Watch, Headset));
        };
    }
}
