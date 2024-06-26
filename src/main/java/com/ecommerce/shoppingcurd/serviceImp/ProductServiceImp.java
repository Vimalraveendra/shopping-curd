package com.ecommerce.shoppingcurd.serviceImp;

import com.ecommerce.shoppingcurd.entity.Product;
import com.ecommerce.shoppingcurd.repository.ProductRepository;
import com.ecommerce.shoppingcurd.service.ProductService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
public class ProductServiceImp implements ProductService {
    @Autowired
    private ProductRepository repository;

    public List<Product> getProducts(){
        return repository.findAll(Sort.by(Sort.Direction.DESC,"ProductId"));
    }

    @Override
    public Product saveProduct(Product product) {
        return repository.save(product);
    }

    @Override
    public Product getProductById(Long id) {
        return repository.findById(id).get();
    }

    @Override
    public void updateProduct(Product product) {
        repository.save(product);
    }

    @Override
    public  void deleteProduct(Long id){
        repository.deleteById(id);
    }
}
