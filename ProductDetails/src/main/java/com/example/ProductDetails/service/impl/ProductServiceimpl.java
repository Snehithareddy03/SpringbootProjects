package com.example.ProductDetails.service.impl;


import com.example.ProductDetails.dto.ProductDTO;
import com.example.ProductDetails.entity.ProductEntity;
import com.example.ProductDetails.repository.ProductRepository;
import com.example.ProductDetails.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class ProductServiceimpl implements ProductService {
    @Autowired
    private ProductRepository repo;
    @Override
    public ProductDTO createProduct(ProductDTO productdto){
        ProductEntity product = new ProductEntity(
                productdto.getProductId(),
                productdto.getName(),
                productdto.getPrice(),
                productdto.getQuantity()
        );
        ProductEntity saved = repo.save(product);
        ProductDTO createProduct = new ProductDTO(
                saved.getProductId(),
                saved.getName(),
                saved.getPrice(),
                saved.getQuantity()
        );
        return createProduct;
    }
}
