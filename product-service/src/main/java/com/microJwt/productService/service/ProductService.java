package com.microJwt.productService.service;

import com.microJwt.productService.dto.request.ProductRequestDTO;
import com.microJwt.productService.dto.response.ProductResponseDTO;
import com.microJwt.productService.model.Product;
import com.microJwt.productService.repository.ProductRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
@Slf4j
public class ProductService {

    private final ProductRepository productRepository;

    public void createProd(ProductRequestDTO productRequestDTO){
        Product product = Product.builder()
                .name(productRequestDTO.getName())
                .description(productRequestDTO.getDescription())
                .price(productRequestDTO.getPrice())
                .build();

        productRepository.save(product);
        log.info("The product '{}' has been saved successfully", product.getName());
    }

    public List<ProductResponseDTO> getallProd() {
        List<Product> products = productRepository.findAll();

        return products.stream().map(this::mapToProductResponse).toList();
    }

    public ProductResponseDTO mapToProductResponse(Product product){
        return ProductResponseDTO.builder()
                .id(product.getId())
                .name(product.getName())
                .description(product.getDescription())
                .price(product.getPrice())
                .build();

    }
}
