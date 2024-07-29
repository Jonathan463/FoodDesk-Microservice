package com.example.product.serviceImpl;

import com.example.product.dto.ProductRequest;
import com.example.product.dto.ProductResponse;
import com.example.product.service.ProductService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {
    @Override
    public String createProduct(ProductRequest productRequest) {
        return null;
    }

    @Override
    public ProductResponse getProductById(int id) {
        return null;
    }

    @Override
    public String updateProductById(int id) {
        return null;
    }

    @Override
    public List<ProductResponse> getAllProduct() {
        return null;
    }
}
