package com.example.TourManagementSystem.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Entity
@Getter
@Setter
public class TourPackage {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int tourPackageId;
    private String tName;
    private String tType;
    private int duration;
    private int tPrice;
    private String tDesc;
    private int availableSeat;



    @ManyToOne(cascade = CascadeType.PERSIST)
    @JoinColumn(name="card_id")
    @JsonBackReference
    private Cart cart_tour;
    @ManyToMany(mappedBy = "tourPackage")
    @JsonManagedReference
    private List<User> user;

}
