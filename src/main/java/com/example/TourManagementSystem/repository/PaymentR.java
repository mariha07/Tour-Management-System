package com.example.TourManagementSystem.repository;

import com.example.TourManagementSystem.entity.Payment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PaymentR extends JpaRepository<Payment,Integer> {
}
