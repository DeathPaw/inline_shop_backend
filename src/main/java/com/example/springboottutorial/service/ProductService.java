package com.example.springboottutorial.service;


import com.example.springboottutorial.entity.Product;
import com.example.springboottutorial.repository.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class ProductService {
    @Autowired
    private ProductRepo productRepo;

    public boolean create(Product product){
        if (!productRepo.existsByName(product.getName())){
            productRepo.save(product);
            return true;
        }
        return false;
    }
    public List<Product> readAll() {
        return productRepo.findAll();
    }
    public Product read(UUID id) {
        return productRepo.findById(id).orElse(null);
    }

    public boolean update(Product element, UUID id) {
        if (productRepo.existsById(id)) {
            element.setUuid(id);
            productRepo.save(element);
            return true;
        }
        return false;
    }
    public boolean delete(UUID id) {
        if (productRepo.existsById(id)) {
            productRepo.deleteById(id);
            return true;
        }
        return false;
    }
}
