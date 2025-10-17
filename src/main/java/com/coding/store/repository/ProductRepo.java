package com.coding.store.repository;


import com.coding.store.model.Product;
import org.springframework.data.mongodb.repository.MongoRepository;


public interface ProductRepo extends MongoRepository<Product, String> {
}
