package com.example.TourManagementSystem.controller;

import com.example.TourManagementSystem.DTO.UserDTO;
import com.example.TourManagementSystem.entity.User;
import com.example.TourManagementSystem.service.UserService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
public class UserController {
    private final UserService userService;

    @GetMapping(value = "user/list")
    public List<User> listOfUser(){
        return userService.getAllUser();

    }
    @PostMapping(value = "User/add")
    public void insertUserData(@RequestBody UserDTO userDTO){
        userService.addUser(userDTO);
    }
    @PutMapping(value = "User/update/{id}")
   public void updateUserData(@PathVariable int id, @RequestBody UserDTO userDTO){
        userService.updateUser(id,userDTO);
   }
   @DeleteMapping(value = "User/delete/{id}")
    public void deleteUserData(@PathVariable int id){
        userService.deleteUser(id);
    }


}
