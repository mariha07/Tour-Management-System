package com.example.TourManagementSystem.service;

import com.example.TourManagementSystem.DTO.UserDTO;
import com.example.TourManagementSystem.entity.User;
import com.example.TourManagementSystem.repository.UserR;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class UserService {
    private final UserR userR;

    public void addUser(UserDTO userDTO) {
        User user = new User();
        user.setName(userDTO.getName());
        user.setPassword(userDTO.getPassword());
        user.setEmail(userDTO.getEmail());
        user.setAddress(userDTO.getAddress());

        userR.save(user);
    }


    public void updateUser(int id, UserDTO userDTO) {
        User user =userR.findById(id).get();
        user.setName(userDTO.getName());
        user.setPassword(userDTO.getPassword());
        user.setEmail(userDTO.getEmail());
        user.setAddress(userDTO.getAddress());
        userR.save(user);
    }

    public void deleteUser(int id) {
        User user =userR.findById(id).get();
        userR.delete(user);
    }

    public List<User> getAllUser() {
        List<User>userList = userR.findAll();
        return userList;
    }
}
