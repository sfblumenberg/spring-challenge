package com.example.demo.service;

import com.example.demo.repository.OrderRepository;
import com.example.demo.repository.entity.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderService {
    @Autowired
    private OrderRepository orderRepository;

    public Order getOrderById(Long id) {
        return orderRepository.getById(id);
    }
}
