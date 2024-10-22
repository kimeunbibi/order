package org.example.ordersystem.service;

import org.example.ordersystem.mapper.OrderMapper;
import org.example.ordersystem.model.Order;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderService {

    private final OrderMapper mapper;

    public OrderService(OrderMapper mapper) {
        this.mapper = mapper;
    }

    public List<Order> getOrders() {
        return mapper.getOrders();
    }

    public void makeOrder() {
        mapper.makeOrder();
    }
}
