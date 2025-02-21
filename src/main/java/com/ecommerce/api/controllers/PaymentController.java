package com.ecommerce.api.controllers;

import com.ecommerce.api.dto.PaymentDTO;
import com.ecommerce.api.entities.Payment;
import com.ecommerce.api.services.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/payments")
public class PaymentController {
    @Autowired
    private PaymentService paymentService;

    @GetMapping(value = "/{id}")
    public ResponseEntity<PaymentDTO>findById(@PathVariable Long id){
        PaymentDTO dto = paymentService.findById(id);
        return ResponseEntity.ok(dto);
    }

    @GetMapping
    public ResponseEntity<List<PaymentDTO>> findAll(){
        List<PaymentDTO> dtoList = paymentService.findAll();
        return ResponseEntity.ok(dtoList);
    }

    @PostMapping
    public ResponseEntity<PaymentDTO> create(@RequestBody PaymentDTO dto){
        PaymentDTO paymentDTO = paymentService.create(dto);
        return ResponseEntity.ok(paymentDTO);
    }

    @PutMapping(value = "/{id}")
    public ResponseEntity<PaymentDTO> update(@PathVariable Long id, @RequestBody PaymentDTO dto){
        PaymentDTO paymentDTO = paymentService.update(id, dto);
        return ResponseEntity.ok(paymentDTO);
    }

    @DeleteMapping(value = "/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id){
        paymentService.delete(id);
        return ResponseEntity.noContent().build();
    }
}
