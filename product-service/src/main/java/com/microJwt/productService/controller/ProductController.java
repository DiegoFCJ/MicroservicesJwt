package com.microJwt.productService.controller;

import com.microJwt.productService.dto.ProductRequest;
import com.microJwt.productService.dto.ProductResponse;
import com.microJwt.productService.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/product")
@RequiredArgsConstructor
public class ProductController {

    private final ProductService productService;

    @PostMapping("/create")
    @ResponseStatus(HttpStatus.CREATED)
    public void createProd(@RequestBody ProductRequest productRequest){
        productService.createProd(productRequest);
    }

    @GetMapping("/getAll")
    @ResponseStatus(HttpStatus.OK)
    public List<ProductResponse> getAllProds(){
        return productService.getallProd();
    }
}
