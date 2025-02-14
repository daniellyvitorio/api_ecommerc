package com.ecommerce.api.dto;

import com.ecommerce.api.entities.OrderStatus;
import com.ecommerce.api.entities.User;
import jakarta.validation.constraints.*;
import lombok.Data;

import java.time.LocalDateTime;
import java.util.List;

@Data
public class OrderDTO {
    private Long id;
    @NotNull(message = "A data do pedido é obrigatória")
    @PastOrPresent(message = "a data do pedido nao pode ser futuro")
    private LocalDateTime moment;
    @NotBlank(message = "o status do pedido é obrigatório")
    @Pattern(regexp = "WAITING_PAYMENT/PAID/SHIPPED/DELIVERED/CANCELLED" , message = "")
    private OrderStatus status;
    private UserDTO user;
    private PaymentDTO payment;
    @NotEmpty(message = "é obrigatório selecionar pelo menos um item")
    private List<OrderItemDTO> orderItems;
}
