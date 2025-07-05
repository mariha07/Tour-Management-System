package com.example.TourManagementSystem.entity;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
@Entity
@Getter
@Setter
public class Payment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int payId;
    private int amount;
    private String status;

    @OneToOne(mappedBy = "payment",cascade = CascadeType.PERSIST)
    @JsonManagedReference
    private Booking booking;
    @OneToOne(mappedBy = "payment",cascade = CascadeType.PERSIST)
    @JsonManagedReference
    private User user;


}
