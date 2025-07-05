package com.example.TourManagementSystem.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Entity
@Getter
@Setter
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private int userId;
    private String name;
    private String password;
    private String email;
    private String address;
    @OneToOne(cascade = CascadeType.PERSIST)
    @JoinColumn(name="booking_id")
    @JsonBackReference
    private Booking booking;
    @OneToOne(cascade = CascadeType.PERSIST)
    @JoinColumn(name="review_id")
    @JsonBackReference
    private Review review;
    @OneToOne(cascade = CascadeType.PERSIST)
    @JoinColumn(name="payment_id")
    @JsonBackReference
    private Payment payment;
    @OneToOne(cascade = CascadeType.PERSIST)
    @JoinColumn(name="cart_id")
    @JsonBackReference
    private Cart cart;
    @ManyToMany(cascade = CascadeType.PERSIST)
    @JoinTable(
            name="user_tour_package",
            joinColumns = @JoinColumn(name="user_id"),
            inverseJoinColumns = @JoinColumn(name="tour_package_id")
    )
    @JsonBackReference
    private List<TourPackage> tourPackage;

}
