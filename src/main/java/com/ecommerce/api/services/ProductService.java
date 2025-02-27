package com.ecommerce.api.services;

import com.ecommerce.api.dto.ProductDTO;
import com.ecommerce.api.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {
    @Autowired
    private ProductRepository productRepository;

    public ProductDTO create(ProductDTO dto){
    }

    public ProductDTO findById(Long id) {
        return null;
    }

    public List<ProductDTO> findAll() {
        return null;
    }

}
