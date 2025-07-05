package com.example.TourManagementSystem.controller;

import com.example.TourManagementSystem.DTO.StaffDTO;
import com.example.TourManagementSystem.DTO.UserDTO;
import com.example.TourManagementSystem.entity.Staff;
import com.example.TourManagementSystem.entity.User;
import com.example.TourManagementSystem.service.StaffService;
import com.example.TourManagementSystem.service.UserService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
public class StaffController {
    private final StaffService staffService;

    @GetMapping(value = "staff/list")
    public List<Staff> listOfStaff(){
        return staffService.getAllStaff();

    }
    @PostMapping(value = "Staff/add")
    public void insertStaffData(@RequestBody StaffDTO staffDTO){
        staffService.addStaff(staffDTO);
    }
    @PutMapping(value = "Staff/update/{id}")
    public void updateStaffData(@PathVariable int id, @RequestBody StaffDTO staffDTO){
        staffService.updateStaff(id,staffDTO);
    }
    @DeleteMapping(value = "Staff/delete/{id}")
    public void deleteStaffData(@PathVariable int id){
        staffService.deleteStaff(id);
    }
}
