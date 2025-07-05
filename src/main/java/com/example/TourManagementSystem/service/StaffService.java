package com.example.TourManagementSystem.service;

import com.example.TourManagementSystem.DTO.StaffDTO;
import com.example.TourManagementSystem.entity.Staff;
import com.example.TourManagementSystem.entity.TourPackage;
import com.example.TourManagementSystem.repository.StaffR;
import com.example.TourManagementSystem.repository.UserR;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class StaffService {
    private final StaffR staffR;
    public void addStaff(StaffDTO staffDTO) {
        Staff staff = new Staff();
        staff.setSName(staffDTO.getSName());
        staff.setSPassword(staffDTO.getSPassword());
        staff.setSAddress(staffDTO.getSAddress());
        staff.setSPosition(staffDTO.getSPosition());
        staff.setSEmail(staffDTO.getSEmail());
       staffR.save(staff);

    }


    public void updateStaff(int id, StaffDTO staffDTO) {
        Staff  staff= staffR.findById(id).get();
        staff.setSName(staffDTO.getSName());
        staff.setSPassword(staffDTO.getSPassword());
        staff.setSAddress(staffDTO.getSAddress());
        staff.setSEmail(staffDTO.getSEmail());
        staff.setSPosition(staffDTO.getSPosition());
        staffR.save(staff);
    }

    public List<Staff> getAllStaff() {
        List<Staff>staffList =staffR.findAll();
        return staffList;
    }

    public void deleteStaff(int id) {
        Staff  staff= staffR.findById(id).get();
        staffR.delete(staff);
    }
}
