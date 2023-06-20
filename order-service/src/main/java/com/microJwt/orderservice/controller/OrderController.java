package com.microJwt.orderservice.controller;

import com.microJwt.orderservice.dto.request.OrderRequestDTO;
import com.microJwt.orderservice.service.OrderService;
import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;
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
    @CircuitBreaker(name = "inventory", fallbackMethod = "fallBackMethod")
    public void create(@RequestBody OrderRequestDTO orderRequestDTO) throws IllegalAccessException {
        orderService.create(orderRequestDTO);
    }

    public String fallBackMethod(OrderRequestDTO orderRequestDTO, RuntimeException runtimeException){
        return "Ops Something went wrong retry after some time";
    }

}
