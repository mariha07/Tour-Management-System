package com.example.TourManagementSystem.repository;

import com.example.TourManagementSystem.entity.Cart;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CartR extends JpaRepository<Cart,Integer> {
}
