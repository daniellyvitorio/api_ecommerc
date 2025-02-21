package com.ecommerce.api.services;

import com.ecommerce.api.dto.PaymentDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PaymentService {
    @Autowired
    private PaymentService paymentService;

    public PaymentDTO findById(Long id) {
        return null;
    }

    public List<PaymentDTO> findAll() {
        return null;
    }

    public PaymentDTO create(PaymentDTO dto) {
        return null;
    }

    public PaymentDTO update(Long id, PaymentDTO dto) {
        return null;
    }

    public void delete(Long id) {
    }
}
