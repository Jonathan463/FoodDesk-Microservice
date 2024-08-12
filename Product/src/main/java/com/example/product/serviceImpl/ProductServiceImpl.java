package com.example.product.serviceImpl;

import com.example.product.dto.ProductRequest;
import com.example.product.dto.ProductResponse;
import com.example.product.model.Product;
import com.example.product.repository.ProductRepository;
import com.example.product.service.ProductService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Slf4j
@RequiredArgsConstructor
@Service
public class ProductServiceImpl implements ProductService {

    private final ProductRepository productRepository;
    @Override
    public String createProduct(ProductRequest productRequest) {

        Product product = new Product();
        product.setSize(productRequest.getSize());
        product.setName(productRequest.getName());
        product.setPrice(productRequest.getPrice());
        product.setDateCreated(String.valueOf(LocalDateTime.now()));
        product.setDateUpdated(String.valueOf(LocalDateTime.now()));
        try {
            productRepository.save(product);
        }
        catch (Exception e){
            log.error(e.getCause().getLocalizedMessage());
        }
        return "Record Successfully Saved";
    }

    @Override
    public ProductResponse getProductById(int id) {
        Product product = productRepository.findById(id).get();
        ProductResponse response = new ProductResponse();
        response.setSize(product.getSize());
        response.setName(product.getName());
        response.setPrice(product.getPrice());
        response.setDateCreated(product.getDateCreated());
        response.setLastUpdatedDate(product.getDateUpdated());
        return response;
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
