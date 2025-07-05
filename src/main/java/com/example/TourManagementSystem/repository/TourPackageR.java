package com.example.TourManagementSystem.repository;

import com.example.TourManagementSystem.entity.TourPackage;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TourPackageR extends JpaRepository<TourPackage,Integer> {
}
