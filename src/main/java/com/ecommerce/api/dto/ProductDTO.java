package com.ecommerce.api.dto;
// aqui nesta aba colocamos as validações
import jakarta.validation.constraints.*;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class ProductDTO {
    private Long id;
    @Size(min = 3, max = 50, message = "Nome deve ter entre 3 e 50 caracteres")
    @NotBlank(message = "Nome é obrigatório")
    private String name;
    @Size(min = 10, message = "Nome deve ter no minimo 10 caracteres")
    @NotBlank(message = "Descrição é obrigatória")
    private String description;
    @NotNull(message = "Preço é obrigatório")
    @Positive(message = "Preço deve ser positivo")
    private double price;
    @NotNull(message = "Imagem é obrigatorio")
    private String imgUrl;
    @NotEmpty(message = "É obrigatorio selecionar pelo menos uma categoria")
    private List<CategoryDTO> categorias = new ArrayList<>();

    public ProductDTO(String name, String description, Double price, String imgUrl) {
        this.name = name;
        this.description = description;
        this.price = price;
        this.imgUrl = imgUrl;
    }
}
