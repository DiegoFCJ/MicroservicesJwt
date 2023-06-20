package com.microJwt.productService.controller;

import com.microJwt.productService.dto.request.ProductRequestDTO;
import com.microJwt.productService.dto.response.ProductResponseDTO;
import com.microJwt.productService.service.ProductService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
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
    public void createProd(@RequestBody ProductRequestDTO productRequestDTO){
        productService.createProd(productRequestDTO);
    }

    @GetMapping("/getAll")
    @ResponseStatus(HttpStatus.OK)
    public List<ProductResponseDTO> getAllProds(){
        return productService.getallProd();
    }
}
