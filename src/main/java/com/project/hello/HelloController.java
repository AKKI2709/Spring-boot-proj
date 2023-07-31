package com.project.hello;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
@RestController
public class HelloController {

    @Autowired
    ProductRepo productRepo;
    @RequestMapping("/hello")
    public String hello() {
        return "Hello World";
    }

    @PostMapping("/products")
    public ProductDetails details(@RequestBody ProductDetails productDetails){

        return productDetails;

    }

}
