package com.mini.exchange.controllers;

import com.mini.exchange.dto.CreateOrderRequest;
import com.mini.exchange.services.OrderService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class OrderController {

    private final OrderService orderService;

    @PostMapping("/orders")
    public Object createOrder(CreateOrderRequest request){
        return orderService.createOrder(request);
    }
}
