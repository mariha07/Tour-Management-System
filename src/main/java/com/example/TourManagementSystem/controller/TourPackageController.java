package com.example.TourManagementSystem.controller;

import com.example.TourManagementSystem.DTO.TourPackageDTO;
import com.example.TourManagementSystem.DTO.UserDTO;
import com.example.TourManagementSystem.entity.TourPackage;
import com.example.TourManagementSystem.entity.User;
import com.example.TourManagementSystem.service.TourPackageService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
public class TourPackageController {
    private final TourPackageService tourPackageService;

    @GetMapping(value = "tourPackage/list")
    public List<TourPackage> listOfUser(){
        return tourPackageService.getAllTourPackage();

    }

    @PostMapping(value = "TourPackage/addTourPackage")
    public void insertTourPackageData(@RequestBody TourPackageDTO tourPackageDTO){
        tourPackageService.addTourPackage(tourPackageDTO);
    }
    @PutMapping(value = "TourPackage/update/{id}")
    public void updateTourPackageData(@PathVariable int id, @RequestBody TourPackageDTO tourPackageDTO){
        tourPackageService.updateTourPackage(id,tourPackageDTO);
    }
    @DeleteMapping(value = "TourPackage/delete/{id}")
    public void deleteTourPackageData(@PathVariable int id){
        tourPackageService.deleteTourPackage(id);
    }
}
