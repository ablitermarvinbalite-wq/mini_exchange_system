package com.mini.exchange.controllers;

import com.mini.exchange.dto.CreateOrderRequest;
import com.mini.exchange.services.OrderService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("api/order")
public class OrderController {

    private final OrderService orderService;

    @PostMapping("/create/order")
    public Object createOrder(CreateOrderRequest request){
        return orderService.createOrder(request);
    }
}
