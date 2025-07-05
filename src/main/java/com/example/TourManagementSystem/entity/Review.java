package com.example.TourManagementSystem.entity;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Review {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int reviewId;
    private int rating;

    private String feedback;
    @OneToOne(mappedBy = "review",cascade = CascadeType.PERSIST)
    @JsonManagedReference
    private User user;
}
