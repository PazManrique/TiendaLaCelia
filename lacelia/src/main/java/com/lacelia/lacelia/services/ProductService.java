package com.lacelia.lacelia.services;
import java.util.List;

import com.lacelia.lacelia.entity.Product;

public interface ProductService {
    List<Product>findAll();
    Product findOne (int id);
    Product create (Product p);
    Product edit (Product p);
    Product delete (Product p);


    
}
