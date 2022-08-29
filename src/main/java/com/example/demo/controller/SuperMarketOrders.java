package com.example.demo.controller;

import com.example.demo.controller.dto.OrderDTO;
import com.example.demo.controller.dto.mapper.OrderMapper;
import com.example.demo.repository.entity.Order;
import com.example.demo.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("orders")
public class SuperMarketOrders {
    @Autowired
    private OrderService orderService;
    @Autowired
    private OrderMapper orderMapperImpl;

    @GetMapping("/{id}")
    public ResponseEntity<OrderDTO> getById(@PathVariable Long id) {
        return new ResponseEntity<>(orderMapperImpl.toDto(orderService.getOrderById(id)), HttpStatus.OK);
    }
    // Todo 1: replicate getter but by queryParam instead of path variable

    // Todo 2: List all orders with pagination

    // Todo 3: Business inquiry 1: list hours of the day with more order placed in desc order

}
