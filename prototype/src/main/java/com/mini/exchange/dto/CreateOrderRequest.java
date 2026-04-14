package com.mini.exchange.dto;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class CreateOrderRequest {

    public String userId;
    public String symbol;
    public String side;
    public BigDecimal price;
    public BigDecimal quantity;
}
