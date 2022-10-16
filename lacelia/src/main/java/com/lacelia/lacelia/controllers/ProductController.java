package com.lacelia.lacelia.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lacelia.lacelia.entity.Product;
import com.lacelia.lacelia.services.ProductService;

@CrossOrigin ("http://localhost:4200")
@RestController
@RequestMapping({"/api"})

public class ProductController {
    @Autowired
    ProductService productService;

    @GetMapping(value="/products")
    public List<Product>findAll(){
        return productService.findAll();
    }
}
