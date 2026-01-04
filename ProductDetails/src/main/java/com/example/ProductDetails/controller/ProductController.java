package com.example.ProductDetails.controller;


import com.example.ProductDetails.dto.ProductDTO;
import com.example.ProductDetails.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/product")
public class ProductController {
    @Autowired
    private ProductService service;
    @PostMapping("/saveproduct")
    public ResponseEntity<ProductDTO> createProduct(@RequestBody ProductDTO productdto){
        ProductDTO p1 = service.createProduct(productdto);
        return new ResponseEntity<>(p1, HttpStatus.CREATED);
    }
}
