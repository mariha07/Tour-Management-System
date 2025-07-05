package com.example.TourManagementSystem.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;
@Entity
@Getter
@Setter
public class Booking {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int bookingId;
    private Date bDate;
    private int numOfSeat;

    @OneToOne(cascade = CascadeType.PERSIST)
    @JoinColumn(name="pay_id")
    @JsonBackReference
    private Payment payment;
    @OneToOne(cascade = CascadeType.PERSIST)
    @JsonBackReference
    private User user;


}
