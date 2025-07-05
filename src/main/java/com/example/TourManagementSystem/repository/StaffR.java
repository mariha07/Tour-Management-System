package com.example.TourManagementSystem.repository;

import com.example.TourManagementSystem.entity.Staff;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StaffR extends JpaRepository<Staff,Integer> {
}
