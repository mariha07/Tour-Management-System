package com.example.TourManagementSystem.service;

import com.example.TourManagementSystem.DTO.TourPackageDTO;
import com.example.TourManagementSystem.DTO.UserDTO;
import com.example.TourManagementSystem.entity.TourPackage;
import com.example.TourManagementSystem.entity.User;
import com.example.TourManagementSystem.repository.TourPackageR;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class TourPackageService {
    private final TourPackageR tourPackageR;

    public void addTourPackage(TourPackageDTO tourPackageDTO) {
        TourPackage tourPackage=new TourPackage();
        tourPackage.setTName(tourPackageDTO.getTName());
        tourPackage.setTType(tourPackageDTO.getTType());
        tourPackage.setDuration(tourPackageDTO.getDuration());
        tourPackage.setTDesc(tourPackageDTO.getTDesc());
        tourPackage.setTPrice(tourPackageDTO.getTPrice());
        tourPackage.setAvailableSeat(tourPackageDTO.getAvailableSeat());
        tourPackageR.save(tourPackage);
    }

    public void updateTourPackage(int id, TourPackageDTO tourPackageDTO) {
     TourPackage tourPackage=tourPackageR.findById(id).get();
        tourPackage.setTName(tourPackageDTO.getTName());
        tourPackage.setTType(tourPackageDTO.getTType());
        tourPackage.setDuration(tourPackageDTO.getDuration());
        tourPackage.setTDesc(tourPackageDTO.getTDesc());
        tourPackage.setTPrice(tourPackageDTO.getTPrice());
        tourPackage.setAvailableSeat(tourPackageDTO.getAvailableSeat());
        tourPackageR.save(tourPackage);
    }

    public void deleteTourPackage(int id) {
        TourPackage tourPackage=tourPackageR.findById(id).get();
        tourPackageR.delete(tourPackage);
    }
    public List<TourPackage> getAllTourPackage() {
        List<TourPackage>tourPackageList = tourPackageR.findAll();
        return tourPackageList;
    }
}