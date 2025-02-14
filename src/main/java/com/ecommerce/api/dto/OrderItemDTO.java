// OrderItemDTO.java
package com.ecommerce.api.dto;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import lombok.Data;

@Data
public class OrderItemDTO {
    private Long orderId; // ID do pedido (extraído de OrderItemPK)
    @NotNull(message = "A quantidade é obrigatória")
    @Positive(message = "A quantidade deve ser positiva.")
    private Long productId; // ID do produto (extraído de OrderItemPK)
    private Integer quantity;
    @NotNull(message = "A preço é obrigatória")
    @Positive(message = "A preço deve ser positiva.")
    private Double price;
}