package org.example.ordersystem.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.example.ordersystem.model.Order;

import java.util.List;

@Mapper
public interface OrderMapper {

    List<Order> getOrders();

    void makeOrder();
}
