package com.mini.exchange.repositories;

import com.mini.exchange.entities.Order;
import org.springframework.stereotype.Repository;

@Repository
public class OrderRepository {

    //TO DO: update using mariadb
    public Order save(Order order){
      return order;
    }

}
