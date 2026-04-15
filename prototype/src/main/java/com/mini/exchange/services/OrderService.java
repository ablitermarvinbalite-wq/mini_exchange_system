package com.mini.exchange.services;

import com.mini.exchange.dto.CreateOrderRequest;
import com.mini.exchange.entities.Order;
import com.mini.exchange.repositories.OrderRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
@RequiredArgsConstructor
public class OrderService {

    private final OrderRepository orderRepository;

    public Order createOrder(CreateOrderRequest request) {
        Order order = new Order();
        order.setUserId(Long.valueOf(request.getUserId()));
        order.setSymbol(request.getSymbol());
        order.setSide(request.getSide());
        order.setPrice(request.getPrice());
        order.setQuantity(request.getQuantity());
        order.setStatus("NEW");
        order.setCreatedAt(LocalDateTime.now());

        return orderRepository.save(order);
    }

}
