package com.mini.exchange.repositories;

import com.mini.exchange.entities.Order;
import org.springframework.stereotype.Repository;

@Repository
public class OrderRepository {

    public Order save(Order order){
      return order;
    }

}
