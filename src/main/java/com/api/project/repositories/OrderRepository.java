package com.api.project.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.api.project.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
