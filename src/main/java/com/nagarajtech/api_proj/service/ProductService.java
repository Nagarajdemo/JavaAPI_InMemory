package com.nagarajtech.api_proj.service;

import com.nagarajtech.api_proj.model.Product;
import com.nagarajtech.api_proj.repo.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {
    @Autowired
    ProductRepo productRepo;
    public List<Product> getAllProducts() {
        return productRepo.findAll();
    }

    public Product getproductById(int id) {
        return productRepo.findById(id).orElse(null);
    }

    public Product addProduct(Product product) {
         return productRepo.save(product);
    }
}
