package com.example.TourManagementSystem.DTO;

import lombok.Data;

@Data
public class TourPackageDTO {
    private int tourPackageId;
    private String tName;
    private String tType;
    private int duration;
    private int tPrice;
    private String tDesc;
    private int availableSeat;
}
