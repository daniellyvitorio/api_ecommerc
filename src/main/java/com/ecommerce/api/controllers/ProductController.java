package com.ecommerce.api.controllers;

import com.ecommerce.api.dto.ProductDTO;
import com.ecommerce.api.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/api/products")
public class ProductController {
    @Autowired
    private ProductService productService;

    @GetMapping(value = "/{id}")//pega o produto por id um por vez
    public ResponseEntity<ProductDTO> findById(@PathVariable Long id) {
        ProductDTO dto = productService.findById(id);
        return ResponseEntity.ok(dto);
    }

    @GetMapping // pega todos os produtos
    public ResponseEntity<List<ProductDTO>> findAll() {
        List<ProductDTO> dtoList = productService.findAll();
        return ResponseEntity.ok(dtoList);
    }

    //@PreAuthorize("hasRole('Role_ADMIN')")
    @PostMapping // adiciona um produto
    public ResponseEntity<ProductDTO> create(@RequestBody ProductDTO dto) {
        ProductDTO productDTO =  productService.create(dto);
        return ResponseEntity.ok(productDTO);
    }

    @PutMapping(value = "{id}")// atualiza/editar um produto
    public ResponseEntity<ProductDTO> update(@PathVariable Long id,@RequestBody ProductDTO dto) {
        ProductDTO productDTO = productService.update(id, dto);
        return ResponseEntity.ok(productDTO);
    }

    @DeleteMapping(value = "/{id}")// exclui um produto
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        productService.delete(id);
        return ResponseEntity.noContent().build();
    }

}