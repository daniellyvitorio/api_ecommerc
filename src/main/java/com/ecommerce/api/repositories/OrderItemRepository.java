// OrderItemRepository.java
package com.ecommerce.api.repositories;

import com.ecommerce.api.entities.OrderItem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {
    // Aqui você pode definir métodos específicos de consulta, caso necessário.
}