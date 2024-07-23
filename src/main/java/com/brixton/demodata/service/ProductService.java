package com.brixton.demodata.service;

import com.brixton.demodata.entities.Product;
import com.brixton.demodata.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class ProductService {
    @Autowired
    ProductRepository productRepository;

    public Product saveOrUpdate(Product product) {

        return productRepository.save(product);
    }

    public Iterable<Product> findAll() {
        return productRepository.findAll();
    }

    public Product findById(Long id) {
        return productRepository.getById(id);
    }

    public void delete(Long id) {
        Product product = findById(id);
        productRepository.delete(product);
    }

    public long size() {
        // TODO Auto-generated method stub
        return productRepository.count();
    }
}
