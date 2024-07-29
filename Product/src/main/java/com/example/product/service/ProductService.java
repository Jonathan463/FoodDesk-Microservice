package com.example.product.service;

import com.example.product.dto.ProductRequest;
import com.example.product.dto.ProductResponse;

import java.util.List;

public interface ProductService {
   String createProduct(ProductRequest productRequest);
   ProductResponse getProductById(int id);
   String updateProductById(int id);
   List<ProductResponse> getAllProduct();
}
