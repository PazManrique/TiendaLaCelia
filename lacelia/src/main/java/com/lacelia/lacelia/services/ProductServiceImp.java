package com.lacelia.lacelia.services;

import java.util.List;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.lacelia.lacelia.dao.ProductRepository;
import com.lacelia.lacelia.entity.Product;

@Service
public class ProductServiceImp implements ProductService{

    private ProductRepository productRepository;
    
    @Autowired
public ProductServiceImp (ProductRepository theProductRepository) {
    productRepository = theProductRepository;
}

    @Override
    public List<Product> findAll() {
                return this.productRepository.findAll();
    }

    @Override
    public Product findOne(int id) {
       
        return null;
    }

    @Override
    public Product create(Product p) {
       
        return null;
    }

    @Override
    public Product edit(Product p) {
      
        return null;
    }

    @Override
    public Product delete(Product p) {
      
        return null;
    }

 

    
}
