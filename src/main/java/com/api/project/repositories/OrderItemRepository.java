package com.api.project.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.api.project.entities.OrderItem;
import com.api.project.entities.pk.OrderItemPk;


public interface OrderItemRepository extends JpaRepository<OrderItem, OrderItemPk>{

}
