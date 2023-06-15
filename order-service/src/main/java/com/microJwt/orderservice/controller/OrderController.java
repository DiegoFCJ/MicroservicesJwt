package com.microJwt.orderservice.controller;

import com.microJwt.orderservice.dto.OrderRequestDTO;
import com.microJwt.orderservice.service.OrderService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/order")
@RequiredArgsConstructor
public class OrderController {

    private final OrderService orderService;

    @PostMapping("/create")
    @ResponseStatus(HttpStatus.CREATED)
    public void create(@RequestBody OrderRequestDTO orderRequestDTO) throws IllegalAccessException {
        orderService.create(orderRequestDTO);
    }

}
