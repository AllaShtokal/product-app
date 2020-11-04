package com.shtokal.simpleapp.repository;

import com.shtokal.simpleapp.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;


public interface ProductRepository extends JpaRepository<Product,Integer> {
    Product findByName(String name);
}

