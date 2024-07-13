package com.mapping.flood_impacts_mapping.service;

import com.mapping.flood_impacts_mapping.entity.Users;

import java.util.List;

public interface UserService {

    public List<Users> getAllUsers();
    public Users getUserById(int id);
    public Users addUser(Users user);
    public Users updateUser(Users user);
    public Users deleteUser(int id) throws Exception;

}
