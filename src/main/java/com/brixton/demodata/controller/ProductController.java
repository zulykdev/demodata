package com.brixton.demodata.controller;

import com.brixton.demodata.entities.Product;
import com.brixton.demodata.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/v1/product")
@CrossOrigin
public class ProductController {
    @Autowired
    ProductService productService;

    @PostMapping("/create")
    public ResponseEntity<?> addPTToBoard(@Validated @RequestBody Product projectProduct, BindingResult result) {

        if (result.hasErrors()) {
            Map<String, String> errorMap = new HashMap<String, String>();

            for (FieldError error : result.getFieldErrors()) {
                errorMap.put(error.getField(), error.getDefaultMessage());
            }
            return new ResponseEntity<Map<String, String>>(errorMap, HttpStatus.BAD_REQUEST);
        }

        Product newPT = productService.saveOrUpdate(projectProduct);

        return new ResponseEntity<Product>(newPT, HttpStatus.CREATED);
    }

    @GetMapping("/all")
    public Iterable<Product> getAllProducts() {
        return productService.findAll();
    }

    @GetMapping("/size")
    public long getAllProductSize() {
        return productService.size();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Product> getProductById(@PathVariable Long id) {
        Product category = productService.findById(id);
        return new ResponseEntity<Product>(category, HttpStatus.OK);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<String> deleteProduct(@PathVariable Long id) {
        productService.delete(id);
        return new ResponseEntity<String>("category was deleted", HttpStatus.OK);
    }
}