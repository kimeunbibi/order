package org.example.ordersystem.controller;

import org.example.ordersystem.model.Order;
import org.example.ordersystem.service.OrderService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;
import java.util.List;

@RestController
public class OrderController {

    private final OrderService orderService;

    public OrderController(OrderService orderService) {
        this.orderService = orderService;
    }

    @GetMapping("/getOrders")
    public List<Order> getOrders() {
        return orderService.getOrders();
    }

    @PostMapping("/makeOrder")
    public void makeOrder(@RequestParam String productName, @RequestParam int quantity) {
        Order order = new Order();
        order.setProductName(productName);
        order.setQuantity(quantity);
        order.setOrderDate(LocalDateTime.now());

        orderService.makeOrder();
    }
}
