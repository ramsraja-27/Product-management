package com.example.productmanagement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/product")
public class Controller {
    @Autowired
    private ProductService productService;
    @GetMapping
    public List<Product> getAllPro() {
        return productService.getAllPro();
    }

    @PostMapping
    public Product saveProduct(@RequestBody Product product) {
        return productService.saveProduct(product);
    }
}
