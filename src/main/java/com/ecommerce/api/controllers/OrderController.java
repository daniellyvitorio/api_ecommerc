package com.ecommerce.api.controllers;

import com.ecommerce.api.dto.OrderDTO;
import com.ecommerce.api.entities.Order;
import com.ecommerce.api.services.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/orders")
public class OrderController {
    @Autowired
    private OrderService orderService;

    @GetMapping(value = "/{id}")
    public ResponseEntity<OrderDTO> findById(@PathVariable Long id){
        OrderDTO dto = orderService.findById(id);
        return ResponseEntity.ok(dto);
    }

    @GetMapping
    public ResponseEntity<List<OrderDTO>> findAll(){
        List<OrderDTO> dtoList = orderService.findAll();
        return ResponseEntity.ok(dtoList);
    }

    @PostMapping
    public ResponseEntity<OrderDTO> create (@RequestBody OrderDTO dto){
        OrderDTO orderDTO = orderService.create(dto);
        return ResponseEntity.ok(orderDTO);
    }

    @PutMapping(value = "/{id}")
    public ResponseEntity<OrderDTO> update(@PathVariable Long id, @RequestBody OrderDTO dto){
        OrderDTO orderDTO = orderService.update(id, dto);
        return ResponseEntity.ok(orderDTO);
    }

    @DeleteMapping(value = "/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id){
        orderService.delete(id);
        return ResponseEntity.noContent().build();
    }

}
