package com.ecommerce.api.services;

import com.ecommerce.api.dto.ProductDTO;
import com.ecommerce.api.entities.Product;
import com.ecommerce.api.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProductService {
    @Autowired
    private ProductRepository productRepository;

    @Transactional(readOnly = true)
    public ProductDTO getProductBy(Long id){
        Product product = productRepository.findById(id).orElseThrow();

        return  new ProductDTO(product.getName(), product.getDescription(), product.getPrice(), product.getImgUrl());
    }

    @Transactional(readOnly = true)
    public List<ProductDTO> getAllProducts(){
        List<Product> products = productRepository.findAll();
        List<ProductDTO> productsDTO = new ArrayList<>();
        for(Product product : products){
            productsDTO.add(new ProductDTO(product.getName(), product.getDescription(), product.getPrice(), product.getImgUrl()));
        }
        return productsDTO;
    }
    public ProductDTO create(ProductDTO dto){
        Product product = new Product();
        product.setName(dto.getName());
        product.setDescription(dto.getDescription());
        product.setPrice(dto.getPrice());
        product.setImgUrl(dto.getImgUrl());
        product.setCategories(dto.getCategorias());

        productRepository.save(product);
        return new ProductDTO(product.getName(), product.getDescription(), product.getPrice(), product.getImgUrl());
    }

    @Transactional
    public ProductDTO update(Long id, ProductDTO dto) { //nao é possivel salvar um dto por isso criei um novo objeto chamdo product
        Product product = new Product();
        product.setId(id);
        product.setName(dto.getName());
        product.setDescription(dto.getDescription());
        product.setPrice(dto.getPrice());
        product.setImgUrl(dto.getImgUrl());
        product.setCategories(dto.getCategorias());
        productRepository.save(product);
        return new ProductDTO(product.getName(), product.getDescription(), product.getPrice(), product.getImgUrl());
    }

    public void delete(Long id) {
        productRepository.deleteById(id);
    }

    public ProductDTO findById(Long id) {
        return null;
    }

    public List<ProductDTO> findAll() {
        return null;
    }

}
