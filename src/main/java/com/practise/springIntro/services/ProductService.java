package com.practise.springIntro.services;

import com.practise.springIntro.models.Product;

import java.util.List;


public interface ProductService {

    Product getProductById(Long id);

    List<Product> getAllProducts();

}
