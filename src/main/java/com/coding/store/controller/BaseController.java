package com.coding.store.controller;

import com.coding.store.model.Product;
import com.coding.store.repository.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
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
    public String row(Product product) {
        String sold;
        if(product.getSold())
            sold = "Available";
        else
            sold = "not Available";
        return "<div style = 'background: white; color: MediumSeaGreen; font-size: 20px; padding: 10px; margin: 8px;'><label> <span style = 'background: lightgreen'> Item: </span> </label>" + product.getItem() + "<label><span style = 'background: blue'> Cost: </span>" + product.getCost() + "</label>"  + "<label><span style = 'background: green'> Sold: </span>" +  sold + "</label> </div>" ;
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
