package com.telusko.simpleWebApp.Controller;

import com.telusko.simpleWebApp.Service.ProductService;
import com.telusko.simpleWebApp.model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProductController {
    @Autowired
    ProductService service;
    @GetMapping ("/products")
    public List<Product> getProducts(){
        return service.getProducts();

    }
    @GetMapping("/products/{prodId}")
    public Product getProductById(@PathVariable int prodId){
        return service.getProductById(prodId);
    }

    @PostMapping("/products")
    public Product addProduct(@RequestBody Product prod){
//        System.out.println(prod);
        service.addProduct(prod);
        return prod;
    }
    @PutMapping("/products")
    public Product updateProduct(@RequestBody Product prod){
        service.updateProduct(prod);
        return prod;
    }
    @DeleteMapping("/products/{prodId}")
    public String deleteProduct(@PathVariable int prodId){
        service.deleProduct(prodId);
        return "Product Deleted Successfully";
    }
}
