package com.api.project.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.api.project.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
