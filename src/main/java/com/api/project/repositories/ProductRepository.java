package com.api.project.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.api.project.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{

}
