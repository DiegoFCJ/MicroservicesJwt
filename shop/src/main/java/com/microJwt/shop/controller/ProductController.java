package com.microJwt.shop.controller;

import com.microJwt.shop.dto.ProductRequest;
import com.microJwt.shop.dto.ProductResponse;
import com.microJwt.shop.service.ProductService;
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
