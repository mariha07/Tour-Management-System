package com.example.TourManagementSystem.repository;

import com.example.TourManagementSystem.entity.Booking;
import com.example.TourManagementSystem.entity.Review;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ReviewR extends JpaRepository<Review,Integer> {
}
