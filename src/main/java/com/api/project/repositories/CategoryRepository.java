package com.api.project.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.api.project.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long>{

}
