package com.example.demo.controller.dto.mapper;

import com.example.demo.controller.dto.OrderDTO;
import com.example.demo.repository.entity.Order;
import org.springframework.stereotype.Component;

@Component
public class OrderMapper {
    public OrderDTO toDto(Order order) {
        return new OrderDTO(
        order.getId(),
        order.getUserId(),
        order.getOrderNumber(),
        order.getOrderDayOfTheWeek(),
        order.getOrderHourOfDay(),
        order.getDaysSincePriorOrder(),
        order.getOrderDetail());
    }
}
