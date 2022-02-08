package com.example.demo.controller;

import com.example.demo.controller.dto.OrderDTO;
import com.example.demo.controller.dto.mapper.OrderMapper;
import com.example.demo.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("orders")
public class SuperMarketOrders {
    @Autowired
    private OrderService orderService;
    @Autowired
    private OrderMapper orderMapper;

    @GetMapping("/{id}")
    @ResponseBody
    public OrderDTO getById(@PathVariable Long id) {
        return orderMapper.toDto(orderService.getOrderById(id));
    }
    // Todo 1: replicate getter but by queryParam instead of path variable

    // Todo 2: List all orders with pagination

    // Todo 3: Business inquiry 1: list hours of the day with more order placed in desc order

}
