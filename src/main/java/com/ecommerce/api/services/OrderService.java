package com.ecommerce.api.services;

import com.ecommerce.api.dto.OrderDTO;
import com.ecommerce.api.repositories.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderService {
    @Autowired
    private OrderRepository orderRepository;

    public OrderDTO update(Long id, OrderDTO dto) {
        return null;
    }

    public OrderDTO create(OrderDTO dto) {
        return null;
    }

    public OrderDTO findById(Long id) {
        return null;
    }

    public List<OrderDTO> findAll() {
        return null;
    }

    public void delete(Long id) {
    }
}
