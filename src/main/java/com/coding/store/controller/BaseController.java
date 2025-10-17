package com.coding.store.controller;

import com.coding.store.model.Product;
import com.coding.store.repository.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin("http://localhost:3000/")
@RestController
public class BaseController {
    @Autowired
    ProductRepo repo;
    @CrossOrigin("http://localhost:3000/")
    @PostMapping("/AddProduct")
    public void addProduct(@RequestBody Product product) {
        repo.insert(product);
    }
    @CrossOrigin("http://localhost:3000/")
    @GetMapping("/")
    public String greet() {
        return "Hello Welcome to coding products";
    }
    @CrossOrigin("http://localhost:3000/")
    @GetMapping("/AllProducts")
    public List<Product> AllProducts() {
        return repo.findAll();
    }
    @CrossOrigin("http://localhost:3000/")
    @DeleteMapping("/DeleteProduct/{id}")
    public void deleteProduct(@PathVariable("id") String product) {
        repo.deleteById(product);
    }
    @CrossOrigin("http://localhost:3000/")
    @DeleteMapping("DeleteAll")
    public void deleteAll() {
        repo.deleteAll();
    }
    @CrossOrigin("http://localhost:3000/")
    @PutMapping("UpdateProduct")
    public void updateProduct(@RequestBody Product product) {
        repo.save(product);
    }
}
