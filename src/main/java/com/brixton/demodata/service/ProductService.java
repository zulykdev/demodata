package com.brixton.demodata.service;

import com.brixton.demodata.entities.Category;
import com.brixton.demodata.entities.Product;
import com.brixton.demodata.repositories.CategoryRepository;
import com.brixton.demodata.repositories.ProductRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Slf4j
public class ProductService {
    @Autowired
    ProductRepository productRepository;

    @Autowired
    CategoryRepository categoryRepository;

    public Product saveOrUpdate(Product product) {
        log.info("ingreso a product: {}", product);
        return productRepository.save(product);
    }

    public Iterable<Product> findAll() {
        return productRepository.findAll();
    }

    public Iterable<Category> findAllCategories() {
        return categoryRepository.findAll();
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
