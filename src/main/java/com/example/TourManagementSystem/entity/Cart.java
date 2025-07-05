package com.example.TourManagementSystem.entity;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Entity
@Getter
@Setter
public class Cart {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int cartId;
     @OneToOne(mappedBy = "cart",cascade = CascadeType.PERSIST)
     @JsonManagedReference
    private User user;
     @OneToMany(mappedBy = "cart_tour",cascade = CascadeType.PERSIST)
     @JsonManagedReference
     private List<TourPackage> tourPackage;
}
