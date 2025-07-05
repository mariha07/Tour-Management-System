package com.example.TourManagementSystem.DTO;

import lombok.Data;


@Data
public class UserDTO {
    private int userId;
    private String name;
    private String password;
    private String email;
    private String address;

}
