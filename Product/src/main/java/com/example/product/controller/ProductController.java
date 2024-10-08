package com.example.product.controller;

import com.example.product.dto.ProductRequest;
import com.example.product.dto.ProductResponse;
import com.example.product.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
@RequestMapping("/food_desk")
public class ProductController {

    private final ProductService productService;

    @PostMapping("create-product")
    public ResponseEntity<?> createProduct(@RequestBody ProductRequest productRequest){
        String response = productService.createProduct(productRequest);
        return ResponseEntity.ok(response);
    }

    @GetMapping("/get-product/{id}")
    public ResponseEntity<?> getProductById(@PathVariable int id){
        ProductResponse productResponse = productService.getProductById(id);
        return ResponseEntity.ok(productResponse);
    }
}
