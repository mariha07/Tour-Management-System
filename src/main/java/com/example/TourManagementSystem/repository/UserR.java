package com.example.TourManagementSystem.repository;

import com.example.TourManagementSystem.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserR extends JpaRepository<User,Integer> {

}
