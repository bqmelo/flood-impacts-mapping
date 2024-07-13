package com.mapping.flood_impacts_mapping.service;

import com.mapping.flood_impacts_mapping.entity.Users;

import java.util.List;

public interface UserService {
    List<Users> getAllUsers();
    Users getUserById(int id);
    Users addUser(Users user);
    Users updateUser(Users user);
    void deleteUser(int id) throws Exception;
}
